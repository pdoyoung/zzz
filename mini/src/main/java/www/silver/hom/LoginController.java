package www.silver.hom;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import www.silver.service.IF_LoginService;
import www.silver.vo.MemberVO;

@Controller
public class LoginController {
	
	@Inject
	IF_LoginService loginservice;
	
	@GetMapping("loginForm")
	public String loginForm() {
		return "login/loginForm";
	}
	
	@PostMapping("login")
	public String login(@RequestParam("id")String id,
			@RequestParam("pass")String pass,HttpSession session) throws Exception {
		
		//select * from member id = ?
		MemberVO mvo = loginservice.login(id);
		System.out.println(mvo.getId()+"/"+mvo.getPass()+"/"+mvo.getName());
		//리턴받은 memberVO 객체의 비밀번호와 일치 하는지 확인
		if(mvo!=null) {
			if(mvo.getPass().equals(pass)) {
				//로그인성공
				//세션처리
				//이때 서버는 쿠키를 만들고 세션영ㅇ역을 쿠키로 구분이 가능하다. 클라이언트는
				//접속시 쿠키값을 서버에 전송하고 서버에서는 쿠키값을 참고하여 세션에서 등록된 변수 값을 가져온다.
				if(session.getAttribute("userid")!=null) {//만약 쓰레기 값이 있다면
					session.removeAttribute("userid");//지워라
					session.removeAttribute("username");
					session.removeAttribute("grade");
				}
				session.setAttribute("userid", mvo.getId());
				session.setAttribute("username", mvo.getName());
				session.setAttribute("grade", "vip");//DB에서 저장된 값으로 세팅 할 수도 있다.
				
			}else {
				//비밀번호가 틀림
			}
		}else {
			//아이디없음
		}
		
		
		
		//세션처리..
		
		
		return "redirect:/";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	
}
