package com.cap.service;
import java.util.List;

import com.cap.entities.Transaction;

public interface IPassbookService {

  List<Transaction> accountSummary(String transAccountId);
  boolean updatePassbook(String transAccountId);
 
	
}
