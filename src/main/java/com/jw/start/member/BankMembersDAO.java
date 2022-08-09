package com.jw.start.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jw.start.util.DBConnector;

public class BankMembersDAO implements MembersDAO{

	@Override
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception {
		Connection con  = DBConnector.getConnection();
		String sql="insert into BANKMEMBERS(username, password, name, email, phone) values (?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, bankMembersDTO.getUsername());
		st.setString(2, bankMembersDTO.getPassword());
		st.setString(3, bankMembersDTO.getName());
		st.setString(4, bankMembersDTO.getEmail());
		st.setString(5, bankMembersDTO.getPhone());
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return result;
	}

	@Override
	public ArrayList<BankMembersDTO> getSearchByID(String search) throws Exception {
		
		ArrayList<BankMembersDTO> bankMembersDTOs = new ArrayList<BankMembersDTO>();
		
		BankMembersDTO bankMembersDTO =new BankMembersDTO();
		Connection con  = DBConnector.getConnection();
		
		String sql ="select * from BANKMEMBERS where USERNAME like ? ORDER BY USERNAME DESC";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		
		st.setString(1,"%"+ search +"%");
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			bankMembersDTO.setUsername(rs.getString("username"));
			bankMembersDTO.setPassword(rs.getString("password"));
			bankMembersDTO.setName(rs.getString("name"));
			bankMembersDTO.setEmail(rs.getString("email"));
			bankMembersDTO.setPhone(rs.getString("phone"));
			bankMembersDTOs.add(bankMembersDTO);
		}
		DBConnector.disConnect(rs, st, con);
		
		return bankMembersDTOs;
	}
	
	
}
