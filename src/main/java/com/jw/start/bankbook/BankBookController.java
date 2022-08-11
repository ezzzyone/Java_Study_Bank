package com.jw.start.bankbook;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jw.start.member.BankMembersDTO;


@Controller
@RequestMapping (value="/bankbook/*")

public class BankBookController  {

	//Model
	@RequestMapping(value="list",method=RequestMethod.GET)
	public String list(Model model) throws Exception{
		//jsp로 보낼 데이터를 model에 담는다.
		BankBookDAO bankBookDAO = new BankBookDAO();
		ArrayList<BankBookDTO> ar = bankBookDAO.getList();
		model.addAttribute("list",ar);
		return "bankbook/list";
	}
	
	@RequestMapping(value="detail",method=RequestMethod.GET)
	public ModelAndView detail(BankBookDTO bankBookDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		System.out.println(bankBookDTO.getBookNum());
		
		BankBookDAO bankBookDAO = new BankBookDAO();
		bankBookDTO = bankBookDAO.getDetail(bankBookDTO);
		//return "bankbook/detail";
		mv.setViewName("bankbook/detail");
		mv.addObject("dto", bankBookDTO);
		
		return mv;
	}
	
//ModelAndView
	@RequestMapping(value="add",method=RequestMethod.GET)
	public ModelAndView add(){
		//modelandview로 리턴
		ModelAndView mv = new ModelAndView();
		System.out.println("add에 get으로 접근!");
		mv.setViewName("bankbook/add"); //직접 지정
		//return "bankbook/add"; -- setViewName 리턴과정을 스프링이 해줌. 
		
		return mv; //직접 지정
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public ModelAndView add (BankBookDTO bankBookDTO) throws Exception{
		//RequestMapping 경로잡아주고 void로 리턴값 설정하면 리턴해주지 않아도 됨
		System.out.println("add에 post로 접근!");
		BankBookDAO bankBookDAO= new BankBookDAO();
		ModelAndView mv = new ModelAndView();
		int rs = bankBookDAO.setBankBook(bankBookDTO);
		if (rs==1){
			System.out.println("성공~ ^ ^");
		}else { System.out.println("실패 ㅠㅠ");	}
		
		mv.setViewName("redirect:./list");
		
		return mv;
	}
}