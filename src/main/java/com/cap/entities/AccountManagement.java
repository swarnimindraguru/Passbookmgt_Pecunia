package com.cap.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//@Entity
//@Table(name="accounts")
public class AccountManagement {

	//@Id
	//@GeneratedValue
	private String accountId;
	
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	private String accountHolderId;
	private String accountBranchId;
	private String accountType;
	private String accountStatus;
	private Double accountBalance;
	private Double accountInterest;
	private Date lastUpdated;


	public String getAccountHolderId() {
		return accountHolderId;
	}
	public void setAccountHolderId(String accountHolderId) {
		this.accountHolderId = accountHolderId;
	}
	public String getAccountBranchId() {
		return accountBranchId;
	}
	public void setAccountBranchId(String accountBranchId) {
		this.accountBranchId = accountBranchId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Double getAccountInterest() {
		return accountInterest;
	}
	public void setAccountInterest(Double accountInterest) {
		this.accountInterest = accountInterest;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountManagement account = (AccountManagement) o;
        return accountId == account.accountId;
    }
	
	 @Override
	    public int hashCode() {
	        return Objects.hash(accountId);
	    }
	
}
