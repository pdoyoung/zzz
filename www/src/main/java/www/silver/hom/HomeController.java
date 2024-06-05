package www.silver.hom;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import www.silver.service.IF_PostService;
import www.silver.vo.PostVO;

/** aaa
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Inject
	IF_PostService pservice;
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	@RequestMapping(value="/input",method = RequestMethod.GET)
	public String input() {
		
		
		return "inputForm";
	}
	@RequestMapping(value="/inputSave",method = RequestMethod.POST)
	public String inputSave(@ModelAttribute PostVO pvo) throws Exception {
		System.out.println(pvo.toString());
		pservice.insert(pvo);
		
		return "redirect:tList";
	}
	@GetMapping("/tList")
	public String tList(Model model) throws Exception{
		List<PostVO> tList = pservice.tList();
		model.addAttribute("tListitems", tList);
		return "trList";
	}
	@GetMapping("/delete")
	public String delete(Model model) throws Exception{
		List<PostVO> tList = pservice.tList();
		model.addAttribute("tListitems", tList);
		return "delete";
	}
	@RequestMapping(value = "deleteSave",method = RequestMethod.POST)
	public String deleteSave(@ModelAttribute PostVO pvo)throws Exception{
		pservice.delete(pvo);
		return "redirect:delete";//redirect를 안적으면 그냥 delete views를 보여주는거고 redirect를 적어주면 delete를 실행시켜서 views를 보여주는거다
		
	}
	@GetMapping("/update")
	public String update(Model model) throws Exception{
		List<PostVO> tList = pservice.tList();
		model.addAttribute("tListitems", tList);
		return "update";
	}
	@RequestMapping(value = "updateSave",method = RequestMethod.POST)
	public String updateSave(@ModelAttribute PostVO pvo)throws Exception{
		System.out.println(pvo.toString());
		pservice.update(pvo);
		
		return "redirect:update";//redirect를 안적으면 그냥 delete views를 보여주는거고 redirect를 적어주면 delete를 실행시켜서 views를 보여주는거다
		
	}
	//https://bubblecastle.tistory.com/9
	
}
