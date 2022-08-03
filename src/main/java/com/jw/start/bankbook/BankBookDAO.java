package com.jw.start.bankbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jw.start.util.DBConnector;

public class BankBookDAO implements BookDAO{

	@Override
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception {
		
		Connection con = DBConnector.getConnection();
		String sql = "insert into BANKBOOK(BOOKNUM, BOOKNAME, BOOKRATE, BOOKSALE) values (?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, bankBookDTO.getBOOKNUM());
		st.setString(2, bankBookDTO.getBOOKNAME());
		st.setDouble(3,bankBookDTO.getBOOKRATE());
		st.setInt(4, bankBookDTO.getBOOKSALE());
		
		int rs = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return rs;
				
	}

	@Override
	public ArrayList<BankBookDTO> getList() throws Exception {
		
		ArrayList<BankBookDTO> bankBookDTOs = new ArrayList<BankBookDTO>();
		
		Connection con = DBConnector.getConnection();
		String sql = "select * from BANKBOOK ORDER BY BOOKNUM DESC";
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBOOKNUM(rs.getLong("BOOKNUM"));
			bankBookDTO.setBOOKNAME(rs.getNString("BOOKNAME"));
			bankBookDTO.setBOOKRATE(rs.getDouble("BOOKRATE"));
			bankBookDTO.setBOOKSALE(rs.getInt("BOOKSALE"));
			bankBookDTOs.add(bankBookDTO);
		}
		
		DBConnector.disConnect(rs, st, con);
		
		return bankBookDTOs;
	}

	@Override
	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception {
		
		Connection con = DBConnector.getConnection();
		String sql = "update BANKBOOK set booksale= ? where booknum = ?";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, bankBookDTO.getBOOKSALE());
		st.setLong(2, bankBookDTO.getBOOKNUM());
		
		int result = st.executeUpdate();
		
		return result;
	}

	@Override
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception {
		
		BankBookDTO bankBookDTO2 = null;
	
		Connection con  = DBConnector.getConnection();
		String sql ="select * from BANKBOOK where BOOKNUM = ?";
		PreparedStatement st = con.prepareStatement(sql);
		
		
		st.setLong(1, bankBookDTO.getBOOKNUM());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			bankBookDTO2 = new BankBookDTO();
			bankBookDTO2.setBOOKNUM(rs.getLong("BOOKNUM"));
			bankBookDTO2.setBOOKNAME(rs.getNString("BOOKNAME"));
			bankBookDTO2.setBOOKRATE(rs.getDouble("BOOKRATE"));
			bankBookDTO2.setBOOKSALE(rs.getInt("BOOKSALE"));
			
		}
		
		DBConnector.disConnect(rs, st, con);
		
		return bankBookDTO2;
		
	}
	
	
}
