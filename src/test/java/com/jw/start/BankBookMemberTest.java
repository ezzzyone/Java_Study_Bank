package com.jw.start;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jw.home.test.BankBookMemberDAO;
import com.jw.start.member.BankMembersDAO;

public class BankBookMemberTest extends DBTest{

	 @Autowired
	 private BankMembersDAO bankMembersDAO;
	 
	 @Test
	 public void setJoinTest() throws Exception{
		 int result = bankMembersDAO.setJoin("df");
		 assertEquals(1, result);
	 }
	 

}
