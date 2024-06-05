package www.silver.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//인터셉터 기능을 상속 받아야 합니다..
public class AuthenticationInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		Object getSession = session.getAttribute("userid");//세션에서 값을 가져옵니다.
		if(getSession==null) {//로그인한 사람 아님
			response.sendRedirect(request.getContextPath()+"/");//처음화면으로 돌아가
			return false;
		}
		
		return super.preHandle(request, response, handler);//가던길 가라..
	}
	
	
	
	
}
