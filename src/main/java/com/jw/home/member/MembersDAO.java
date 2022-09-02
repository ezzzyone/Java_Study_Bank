package com.jw.home.member;

import java.sql.Connection;
import java.util.List;

import com.jw.home.util.DBConnector;

public interface MembersDAO { 
	
	//bankmembers 테이블에 회원가입
	public int setJoin(BankMembersDTO bankMembersDTO)throws Exception; 
	
	//검색어를 입력해서 ID를 찾기 abc순으로
	public List<BankMembersDTO> getSearchByID(String search)throws Exception;	
}
