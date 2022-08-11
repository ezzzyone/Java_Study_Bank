package com.jw.start.test;

import java.util.ArrayList;

import com.jw.start.bankbook.BankBookDAO;
import com.jw.start.bankbook.BankBookDTO;
import com.jw.start.member.BankMembersDAO;
import com.jw.start.member.BankMembersDTO;

public class BankBookTest {

	public static void main(String[] args) {
	
		BankBookDTO bankBookDTO = new BankBookDTO();
		BankBookDAO bankBookDAO = new BankBookDAO();

		bankBookDTO.setBookNum(1111);
		try {
			int rs = bankBookDAO.setDelete(bankBookDTO);
			System.out.println(bankBookDTO.getBookNum());
			if (rs==1){
				System.out.println("성공~ ^ ^");
			}else { System.out.println("실패 ㅠㅠ");}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		try {
//		
//			bankBookDTO.setBookName("dorara");
//			bankBookDTO.setBookRate(12.23);
//			bankBookDTO.setBookNum(1111);
//			System.out.println(bankBookDTO.getBookNum());
//			int rs = bankBookDAO.setUpdate(bankBookDTO);
//			if (rs==1){
//				System.out.println("성공~ ^ ^");
//			}else { System.out.println("실패 ㅠㅠ");}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

		
//		try {
//			int result = bankBookDAO.setBankBook(bankBookDTO);
//			if (result>0){
//				System.out.println("성공~ ^ ^");
//			}else { System.out.println("실패 ㅠㅠ");	}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		
		
		/*try {
			ArrayList<BankBookDTO> bankBookDTOs = bankBookDAO.getList();
			
			for(int i=0; i<bankBookDTOs.size();i++) {
				System.err.println(i);
				System.out.println(bankBookDTOs.get(i).getBOOKNUM());
				System.out.println(bankBookDTOs.get(i).getBOOKNAME());
				System.out.println(bankBookDTOs.get(i).getBOOKRATE());
				System.out.println(bankBookDTOs.get(i).getBOOKSALE());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//4번
//		bankBookDTO.setBOOKNUM(1111);
//		try {
//			bankBookDTO2 = bankBookDAO.getDetail(bankBookDTO);
//			System.out.println(bankBookDTO2.getBOOKNUM());
//			System.out.println(bankBookDTO2.getBOOKNAME());
//			System.out.println(bankBookDTO2.getBOOKRATE());
//			System.out.println(bankBookDTO2.getBOOKSALE());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		//3번
		
//		bankBookDTO.setBookNum(0);
//		bankBookDTO.setBookSale(1);
//		 try {
//			int result = bankBookDAO.setChangeSale(bankBookDTO);
//			if (result>0){
//				System.out.println("성공~ ^ ^");
//			}else { System.out.println("실패 ㅠㅠ");	}
//			} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
	

}
		

