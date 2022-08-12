package com.jw.start.bankAccount;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jw.start.bankbook.BankBookDTO;
import com.jw.start.member.BankMembersDTO;

@Controller
@RequestMapping (value="/bankAccount/*")
public class BankAccountController {
	
	private AccountDAO accountDAO;
	
public BankAccountController() {

	this.accountDAO = new AccountDAO();

}

	@RequestMapping(value="add.do",method=RequestMethod.GET)
	public String add(AccountDTO accountDTO, HttpSession session) throws Exception{
		//북넘은 파라미터로
		System.out.println("bankAccountadd!!!!!!!!!!!!!!!!!!!");
		
		System.out.println("북넘!!!!!!!!:"+accountDTO.getBookNum()); 
		//int rs = accountDAO.add(null);
		BankMembersDTO bankMembersDTO = (BankMembersDTO)session.getAttribute("member");
		accountDTO.setUserName(bankMembersDTO.getUsername());
		
		int rs = this.accountDAO.add(accountDTO);
		
		return "redirect:../bankbook/list.do";
	}
	}
		

