package com.jw.start.member;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankMemberService  {
	
	@Autowired
	private BankMembersDAO bankMembersDAO;
	
	//로그인
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception{
		return bankMembersDAO.getLogin(bankMembersDTO);
	}
	
	//회원가입
		public int setJoin(BankMembersDTO bankMembersDTO)throws Exception{
			
			return bankMembersDAO.setJoin(bankMembersDTO);
		}; 
		
		//검색어를 입력해서 ID를 찾기 abc순으로
		public ArrayList<BankMembersDTO> getSearchByID(String search)throws Exception{
			
			return bankMembersDAO.getSearchByID(search);
		};
	
}
