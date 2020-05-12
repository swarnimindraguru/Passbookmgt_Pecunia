package com.cap.service;
import java.util.List;

import com.cap.entities.Transaction;

public interface IPassbookService {

  List<Transaction> getAllTransactions(String transAccountId);
  //boolean updatePassbook(String transAccountId);
 
	
}
