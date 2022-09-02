package com.jw.home.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jw.home.bankbook.BankBookDTO;
import com.jw.home.util.DBConnector;

@Repository
public class BankMembersDAO implements MembersDAO{
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.jw.home.member.BankMembersDAO.";
	
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception{
		
//		mybatis에서 대신 연결 db.properties
//		Connection con = DBConnector.getConnection();
//		xml파일로 연결
//		String sql = "select USERNAME, NAME from BANKMEMBERS where USERNAME=? and PASSWORD=?";
//		PreparedStatement st = con.prepareStatement(sql);
//		
//		st.setString(1, bankMembersDTO.getUsername());
//		st.setString(2, bankMembersDTO.getPassword());
		
//		ResultSet rs = st.executeQuery();
//		
//		if(rs.next()) {
//			
//			bankMembersDTO = new BankMembersDTO();
//			bankMembersDTO.setUsername(rs.getString("username"));
//			bankMembersDTO.setName(rs.getString("name"));		
//				}else {bankMembersDTO=null;}
		
		return sqlSession.selectOne(NAMESPACE+"getLogin",bankMembersDTO);
		
	}

	@Override
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception {
		
		return sqlSession.insert(NAMESPACE+"setJoin",bankMembersDTO);
				//NAMESPACE+어느아이디로+보내줄것
	}

	@Override
	public List<BankMembersDTO> getSearchByID(String search) throws Exception {
	
		
		return sqlSession.selectList(NAMESPACE+"getSearchByID",search);
	}
	
	
}
