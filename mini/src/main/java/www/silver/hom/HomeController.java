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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import www.silver.service.IF_FoodService;
import www.silver.util.FileDataUtil;
import www.silver.vo.FoodVO;
import www.silver.vo.commentVO;


/** aaa
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Inject
	IF_FoodService fservice;

	@Inject
	FileDataUtil filedatautil;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)//첫화면
	public String home() {

		return "home";
	}
	
	
	@RequestMapping(value = "/input",method = RequestMethod.GET)//등록
	public String input() {
		return "registration";
	}
	@RequestMapping(value="/inputSave",method = RequestMethod.POST)//등록
	public String inputSave(@ModelAttribute FoodVO fvo,MultipartFile[] file) throws Exception{
		/*System.out.println(file.length);
		for(int i=0;i<file.length;i++) {
			System.out.println(file[i].getOriginalFilename());
		}*/
		String[] filename=filedatautil.fileUpload(file);
		for(int i=0; i<filename.length;i++) {
			System.out.println(filename[i]);
		}
		System.out.println(fvo.toString());
		
		
		fvo.setFilename(filename);
		fservice.insert(fvo);
		return "registration";	
	}
	
	@GetMapping(value = "/viewDetail" )
	public String viewDetail(@RequestParam("no")String no,Model model) throws Exception {
		//select * from gg where no = #{no}	//리턴값이 객체 1개
		FoodVO fvo=fservice.modno(no);
		//select filename from food_attach no=#{no}//리턴값이 String 여러개

		List<String> attachList=fservice.getFilenames(no);
		System.out.println(fvo.toString());
		model.addAttribute("foodvo",fvo);
		model.addAttribute("attachList", attachList);
		return "view";
	}
	
	
	
	@RequestMapping(value = "/comment",method = RequestMethod.GET)//댓글
	public String comment(@RequestParam("no") String no, Model model) {
		
		model.addAttribute("tListitems", no);
		return "comment";
	}
	@RequestMapping(value="commentSave",method=RequestMethod.POST)
	public String commentSave(@ModelAttribute commentVO cvo)throws Exception{
		System.out.println(cvo.toString());
		fservice.commentinsert(cvo);
		return "redirect:tList";
		
	}
	
	
	@RequestMapping(value="/searchSave", method = RequestMethod.GET)//검색
	public String searchsave(Model model,@RequestParam String search)throws Exception{
		System.out.println(search);
		if(search=="") {
			return "home";
		}else {
			List<FoodVO> searchList = fservice.searchList("%"+search+"%");
			model.addAttribute("tListitems",searchList);
		}
		return "search";
	}
	//@GetMapping("/searchList")
	//	public String searchList(Model model) throws Exception{
	//	List<FoodVO> searchList = fservice.tList();
	//		model.addAttribute("tListitems", searchList);
	//		return "search";
	//	}
	@RequestMapping(value = "/delno", method = RequestMethod.GET)//삭제
	public String delno(@RequestParam("no") String no) throws Exception {
		System.out.println(no);
		fservice.deleno(no);

		return "redirect:delList";
	}
	@GetMapping("/delList")
	public String delList(Model model) throws Exception{//삭제
		List<FoodVO> tList = fservice.tList();
		model.addAttribute("tListitems", tList);
		return "delList";
	}
	@GetMapping("/modList")
	public String modList(Model model) throws Exception{//수정
		List<FoodVO> tList = fservice.tList();
		model.addAttribute("tListitems", tList);

		return "modList";
	}
	@GetMapping(value = "/modno")
	public String modno(@RequestParam("no") String no, Model model) throws Exception {//수정
		FoodVO fvo = fservice.modno(no);
		System.out.println("수정된 글 정보 확인");
		System.out.println(fvo.toString());
		model.addAttribute("eeee",fvo);
		return "upform";
	}
	@PostMapping(value = "/modnosave")
	public String modnosave(@ModelAttribute FoodVO fvo) throws Exception {//수정
		fservice.modnoSaver(fvo);
		return "redirect:modList";
	}

	@GetMapping("/tList")
	public String tList(Model model) throws Exception{//전체보기
		List<FoodVO> tList = fservice.tList();
		List<commentVO> commentList= fservice.commentList();
		model.addAttribute("tListitems", tList);		
		model.addAttribute("commentListitems", commentList);
		System.out.println(tList.toString());
		System.out.println(commentList.toString());
		
		return "allList";
	}
	//https://bubblecastle.tistory.com/9

}
