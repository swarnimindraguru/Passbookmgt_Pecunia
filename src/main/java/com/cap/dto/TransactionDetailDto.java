package com.cap.dto;

import java.util.Date;

public class TransactionDetailDto {
	
	private Double transAmount;
	private String transOption;
	private Date transDate;
	private String transTo;
	private Double transClosingBalance;
	public Double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
	}
	public String getTransOption() {
		return transOption;
	}
	public void setTransOption(String transOption) {
		this.transOption = transOption;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public String getTransTo() {
		return transTo;
	}
	public void setTransTo(String transTo) {
		this.transTo = transTo;
	}
	public Double getTransClosingBalance() {
		return transClosingBalance;
	}
	public void setTransClosingBalance(Double transClosingBalance) {
		this.transClosingBalance = transClosingBalance;
	}
	
	

}
