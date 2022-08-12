package com.jw.start.bankAccount;

import java.sql.Date;

public class AccountDTO {

	private long accountNum;
	private String userName;
	private long bookNum;
	private Date accountDate;
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getBookNum() {
		return bookNum;
	}
	public void setBookNum(long bookNum) {
		this.bookNum = bookNum;
	}
	public Date getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(Date accountDate) {
		this.accountDate = accountDate;
	}
	
}