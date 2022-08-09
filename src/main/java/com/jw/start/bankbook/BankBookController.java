package com.jw.start.bankbook;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jw.start.member.BankMembersDTO;


@Controller
@RequestMapping (value="/bankbook/*")

public class BankBookController  {

	@RequestMapping(value="list",method=RequestMethod.GET)
	public String list() throws Exception{
		BankBookDTO bankBookDTO = new BankBookDTO();
		BankBookDAO bankBookDAO = new BankBookDAO();
		
		
		return "bankbook/list";
	}
	
	@RequestMapping(value="detail",method=RequestMethod.GET)
	public String detail(Long booknum){
		System.out.println("booknum:"+booknum);
		return "bankbook/detail";
	}
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public String add(){
		System.out.println("add에 get으로 접근!");
		return "bankbook/add";
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add (BankBookDTO bankBookDTO) throws Exception{
		System.out.println("add에 post로 접근!");
		BankBookDAO bankBookDAO= new BankBookDAO();
		int rs = bankBookDAO.setBankBook(bankBookDTO);
		if (rs==1){
			System.out.println("성공~ ^ ^");
		}else { System.out.println("실패 ㅠㅠ");	}
		
		return "bankbook/add";
	}
}
