package com.jw.start.member;


import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jw.start.bankbook.BankBookDAO;
import com.jw.start.bankbook.BankBookDTO;
import com.jw.start.bankbook.BankBookService;

@Controller 
//이 클래스는 컨트롤러 역할

@RequestMapping(value="/member/*") //경로지정
public class MemberController {
	
	private static final String Redirect = null;
	
	@Autowired
	private BankMemberService bankMemberService;


	// 멤버 밑에 로그인 주소가 들어오면 실행해야하는 메서드 만들기
	
	//annotation 
	//@
	//"이렇게 하세요"설명+실행
	 @RequestMapping (value = "logout.do", method= RequestMethod.GET)
	public String logout(HttpSession session) throws Exception{
		 System.out.println("로그아웃 실행");
		session.invalidate();
		return "redirect:/";
		
	}
	
	 @RequestMapping (value = "login.do", method= RequestMethod.GET)
	public String login() {
		System.out.println("로그인 실행");
		return "member/login";
	}
	 
	 @RequestMapping (value = "login.do", method= RequestMethod.POST)
	public String login(HttpServletRequest request, BankMembersDTO bankMembersDTO,Model model) throws Exception{
		System.out.println("db에 로그인 실행");
	
		bankMembersDTO = bankMemberService.getLogin(bankMembersDTO);
		System.out.println(bankMembersDTO);
		HttpSession session = request.getSession();
		session.setAttribute("member", bankMembersDTO);
		
		return "redirect:/";
	}
	
	 //메소드 get으로 실행
	@RequestMapping (value="join.do",method= RequestMethod.GET)
	public String join() {
		System.out.println("조인 GET 실행");
		
		return "member/join";
	}

	//메소드 post로 실행
	@RequestMapping (value="join.do", method = RequestMethod.POST)
	public String join(BankMembersDTO bankMembersDTO) throws Exception{
		System.out.println("조인 POST 실행");
		
//		String join = request.getParameter("id");
//		System.out.println(join);
	
//		BankMembersDTO bankMembersDTO = new BankMembersDTO();

//		bankMembersDTO.setName(request.getParameter("id"));
//		bankMembersDTO.setPassword(request.getParameter("pw"));
//		bankMembersDTO.setUsername(request.getParameter("name"));
//		bankMembersDTO.setPhone(request.getParameter("phone"));
//		bankMembersDTO.setEmail(request.getParameter("email"));
//		이 과정을 모두 스프링이 대신 하게끔 =bean 
//		파라미터 이름과 멤버변수이름이 동일해야한다.****쭝요
//		setter 메서드
		
			int result = bankMemberService.setJoin(bankMembersDTO);
			if (result==1) {
				System.out.println("조인 성공!");
			}else { System.out.println("조인 실패ㅜㅜ");}
	
		
			
		
		return "redirect:./login.do";
	}
//1. void	
//	@RequestMapping (value="search",method= RequestMethod.GET)
//	public void getSearchByID() {
//	}
	
//2.String	
	@RequestMapping (value="search.do",method= RequestMethod.GET)
	public String getSearchByID() {
		
		return "member/search";
	}
	
	
//	ModelAndView
	@RequestMapping (value="search.do",method= RequestMethod.POST)
	public ModelAndView getSearchByID(String search)throws Exception {
		
	
		ModelAndView mv = new ModelAndView();
		List<BankMembersDTO> ar = bankMemberService.getSearchByID(search);
		mv.setViewName("member/list");
		mv.addObject("list", ar);
		
		return mv;
	}

	


}
