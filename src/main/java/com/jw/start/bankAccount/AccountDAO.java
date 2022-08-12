package com.jw.start.bankAccount;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Calendar;

import com.jw.start.util.DBConnector;

public class AccountDAO {
	
	public int add(AccountDTO accountDTO) throws Exception{
		
		Connection con = DBConnector.getConnection();
		String sql = "insert into BANKACCOUNT(ACCOUNTNUM, USERNAME, BOOKNUM, ACCOUNTDATE) values (account_seq.NEXTVAL,?,?,sysdate)";
		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, accountDTO.getUserName());
		st.setLong(2, accountDTO.getBookNum());

		
		int rs = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return rs;
	}

}
