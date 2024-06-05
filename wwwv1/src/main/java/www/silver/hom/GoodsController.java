package www.silver.hom;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import www.silver.service.IF_GoodsService;
import www.silver.vo.GoodsVO;
import www.silver.vo.PageVO;

@Controller
public class GoodsController {
	@Inject //주소 주입받는 어노테이션.. 객체가 컨테이너 있아야 한다. 컨테이너로부터주입받는다
	IF_GoodsService gservice;//다향성을 이용하여 IF_GoodsService 어떠한주소값도 갖는다
	//컨테이너는 하나의 인터페이스는 하나의 클래스만 갖도록 허용한다
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input() {
		return "goodsInput";
	}
	@GetMapping("/allList")
	public String allList(Model model,@ModelAttribute PageVO pagevo) throws Exception{
		//System.out.println("allList mapping");
		
		//확인용 코드
		//System.out.println(allList.size()+"건 가져옴");
		//view전송
		
		//추가작업, 페이지 정보에 따른 시작번호와 끝 번호를 계산.. 자바코드로 처리 ..<PageVO>
		if(pagevo.getPage()==null) {
			pagevo.setPage(1);
		}
		System.out.println("현재페이지 번호:"+pagevo.getPage());
		pagevo.setTotalCount(gservice.getTotalCount());//test하기 위해서 강제로 전체 튜플의 수를 입력함..
		
		pagevo.prt();
		
		System.out.println("시작페이지 번호 : "+pagevo.getStartNo());
		System.out.println("끝페이지 번호 : "+pagevo.getEndNo());
		
		List<GoodsVO> allList = gservice.allList(pagevo);
		model.addAttribute("allListitems", allList);
		//위 코드는 view에게 변수명 allListitems,값 allList를 넘김.
		//allList는 리스트 객체의 주소임, 즉 0개 이상 GoodsVO 객체의 주소가 있음
		model.addAttribute("pagevo", pagevo);
		return "allView";
	}
	@RequestMapping(value = "/inputSave", method = RequestMethod.GET)
	public String inputSave(@ModelAttribute GoodsVO gvo) throws Exception{
		System.out.println(gvo.toString());//클라이언트가 전송한 파리마터 확인
		//클라이언트 요청이 등록이다... 그래서 서비스 >dao >mybatis거쳐서 저장
		//서비스 단 호출
		gservice.insert(gvo);

		return "redirect:allList";
	}
}
