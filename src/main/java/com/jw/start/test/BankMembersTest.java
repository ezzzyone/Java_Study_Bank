package com.jw.start.test;

import java.util.ArrayList;

import com.jw.start.member.BankMembersDAO;
import com.jw.start.member.BankMembersDTO;

public class BankMembersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		BankMembersDTO bankMembersDTO = new BankMembersDTO ();
		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		
		/*bankMembersDTO.setUsername("yj");
		bankMembersDTO.setPassword("dPwl");
		bankMembersDTO.setName("yeji");
		bankMembersDTO.setEmail("hanmail.com");
		bankMembersDTO.setPhone("01059685214");
		try {
		int	result = bankMembersDAO.setJoin(bankMembersDTO);
		
		if (result>0) {
			System.out.println("성공했슴");
		} else {
		System.out.println("실패했슴");}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		try {
			ArrayList<BankMembersDTO> bankMembersDTOs = bankMembersDAO.getSearchByID("jw");
			System.out.println("아이디 "+"비번 "+"  이름 "+"    이메일 "+"      번호");
			for(int i=0; i<bankMembersDTOs.size();i++) {
			System.out.print(bankMembersDTOs.get(i).getUsername()+" "); 
			System.out.print(bankMembersDTOs.get(i).getPassword()+" ");
			System.out.print(bankMembersDTOs.get(i).getName()+" ");
			System.out.print(bankMembersDTOs.get(i).getEmail()+" ");
			System.out.println(bankMembersDTOs.get(i).getPhone());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
