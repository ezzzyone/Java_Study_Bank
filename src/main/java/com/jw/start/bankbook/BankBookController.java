package com.jw.start.bankbook;

import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jw.start.member.BankMembersDTO;


@Controller
@RequestMapping (value="/bankbook/*")

public class BankBookController  {

	@Autowired
	private BankBookService bankBookService;
	//Model
	@RequestMapping(value="list.do",method=RequestMethod.GET)
	public String list(Model model) throws Exception{
		//jsp로 보낼 데이터를 model에 담는다.
	
		ArrayList<BankBookDTO> ar = bankBookService.getList();
		model.addAttribute("list",ar);
		return "bankbook/list";
	}
	
	@RequestMapping(value="detail.do",method=RequestMethod.GET)
	public ModelAndView detail(BankBookDTO bankBookDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		System.out.println("상세조회 통장번호: "+bankBookDTO.getBookNum());
		
		
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		//return "bankbook/detail";
		mv.setViewName("bankbook/detail");
		mv.addObject("dto", bankBookDTO);
		
		return mv;
	}
	
	@RequestMapping(value="delete.do",method=RequestMethod.GET)
	public ModelAndView setDelete(BankBookDTO bankBookDTO) throws Exception{
		System.out.println("삭제");
		ModelAndView mv = new ModelAndView();
		
		int rs = bankBookService.setDelete(bankBookDTO);
		//return "bankbook/detail";

		if (rs==1){
			System.out.println("성공~ ^ ^");
		}else { System.out.println("실패 ㅠㅠ");	}
		
		
		mv.setViewName("redirect:./list.do");
		return mv;
	}
	
//ModelAndView
	@RequestMapping(value="add.do",method=RequestMethod.GET)
	public ModelAndView add(){
		//modelandview로 리턴
		ModelAndView mv = new ModelAndView();
		System.out.println("add에 get으로 접근!");
		BankBookDTO bankBookDTO = new BankBookDTO();
		mv.setViewName("bankbook/add"); //직접 지정
		//return "bankbook/add"; -- setViewName 리턴과정을 스프링이 해줌. 
		
		return mv; //직접 지정
	}
	
	@RequestMapping(value="add.do",method=RequestMethod.POST)
	public ModelAndView add (BankBookDTO bankBookDTO) throws Exception{
		//RequestMapping 경로잡아주고 void로 리턴값 설정하면 리턴해주지 않아도 됨
		System.out.println("add에 post로 접근!");
		
		ModelAndView mv = new ModelAndView();
		int rs = bankBookService.setBankBook(bankBookDTO);
		if (rs==1){
			System.out.println("성공~ ^ ^");
		}else { System.out.println("실패 ㅠㅠ");	}
		
		mv.setViewName("redirect:./list.do");
		
		return mv;
	}
	@RequestMapping(value="update.do",method=RequestMethod.GET)
	public ModelAndView update(BankBookDTO bankBookDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		System.out.println("수정 통장번호: "+bankBookDTO.getBookNum());
		
		
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		//return "bankbook/detail";
		mv.setViewName("bankbook/update");
		mv.addObject("dto", bankBookDTO);
		
		return mv;
		
	}
	
	@RequestMapping(value="update.do",method=RequestMethod.POST)
	public ModelAndView setupdate(BankBookDTO bankBookDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		System.out.println("update-post");
		BankBookDAO bankBookDAO = new BankBookDAO();
		int rs = bankBookDAO.setUpdate(bankBookDTO);
		//return "bankbook/detail";

		if (rs==1){
			System.out.println("성공~ ^ ^");
		}else { System.out.println("실패 ㅠㅠ");	}
		
		mv.setViewName("redirect:./detail.do?bookNum="+bankBookDTO.getBookNum());
		return mv;
		
	}
}
