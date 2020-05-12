package com.cap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cap.dao.IPassbookDao;
import com.cap.entities.Transaction;
import com.cap.exception.AccountNotFoundException;

public class PassbookServiceImpl implements IPassbookService{

	@Autowired
	private IPassbookDao dao;
	@Override
	public List<Transaction> accountSummary(String transAccountId) {
        
	   Optional<Transaction> optional=dao.findById(transAccountId);
	   if(optional.isPresent())
		{
			
			List<Transaction> list=(List<Transaction>) optional.get();
			return list;
		}
		else
		{
			throw new AccountNotFoundException("account not exist");
		}
		
	}

	

}
