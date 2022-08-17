package com.jw.start.member;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jw.start.bankbook.BankBookDAO;

@Service
public class BankMemberService {
	
		@Autowired
		private BankMembersDAO bankMembersDAO;
		
		public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception{
			return bankMembersDAO.getLogin(bankMembersDTO);
			
		};
		
		
		//bankmembers 테이블에 회원가입
		public int setJoin(BankMembersDTO bankMembersDTO)throws Exception{
			
			return bankMembersDAO.setJoin(bankMembersDTO);
		}; 
		
		//검색어를 입력해서 ID를 찾기 abc순으로
		public List<BankMembersDTO> getSearchByID(String search)throws Exception{
			
			return bankMembersDAO.getSearchByID(search);
		};	

}
