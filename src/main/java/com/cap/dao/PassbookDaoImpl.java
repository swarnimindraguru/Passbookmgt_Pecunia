package com.cap.dao;
import java.util.*;

import com.cap.entities.Transaction;

public class PassbookDaoImpl implements IPassbookDao {

	@Override
	public List<Transaction> updatePassbook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> accountSummary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean accountValidation(Account account) {
		ValidateAccount.validateAccountId(transaction);
		return false;
	}

	@Override
	public boolean updateLastUpdated(Account account) {
		// TODO Auto-generated method stub
		return false;
	}
		
	
}
