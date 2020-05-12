package com.cap.entities;

import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="transactions")
public class Transaction {
    
	@Id
	private String transAccountId;
	public String getTransAccountId() {
		return transAccountId;
	}
	public void setTransAccountId(String transAccountId) {
		this.transAccountId = transAccountId;
	}
	
	
	private String transType;
	private Double transAmount;
	private String transOption;
	private Date transDate;
	private String transChequId;
	private String transFrom;
	private String transTo;
	private Double transClosingBalance;
	
	
	
	
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
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
	public String getTransChequId() {
		return transChequId;
	}
	public void setTransChequId(String transChequId) {
		this.transChequId = transChequId;
	}
	public String getTransFrom() {
		return transFrom;
	}
	public void setTransFrom(String transFrom) {
		this.transFrom = transFrom;
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
	

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction transaction = (Transaction) o;
        return transAccountId==transaction.transAccountId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(transAccountId);
    }
	
	
}
