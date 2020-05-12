package com.cap.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.dto.TransactionDetailDto;
import com.cap.entities.Transaction;
import com.cap.service.IPassbookService;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/transactions")
public class PassbookController {
	
	@Autowired
	private IPassbookService service;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	  @GetMapping("/get/{id}")
	    ResponseEntity<List<TransactionDetailDto>> add(@PathVariable("id") String id) 
	    {
	    List<TransactionDetailDto> list=fetchTransactionByAccountId(id);
	    return new ResponseEntity<>(list, HttpStatus.OK);
	    }
	  
	  @PutMapping("/update/{id}")
      public ResponseEntity updatePassbook(@PathVariable("id") String id) 
	  {
      List<TransactionDetailDto> transactions=fetchTransactionByAccountId(id);
      makePassbookupdateRequest();
      return new ResponseEntity<>(transactions, HttpStatus.OK);
      }
	  
	  public void makePassbookupdateRequest()  
	  {
		  restTemplate.put("url for account update",Boolean.class);
	  }

	  

	  public TransactionDetailDto fetchTransactionsByAccountId(String accountId) 
	   {
		    List<TransactionDetailDto> list= new ArrayList<>();
	    	TransactionDetailDto detaildto = new TransactionDetailDto();
	    	detaildto.setTransAmount(100d); 
	    	detaildto.setTransTo("693665825471");
	    	detaildto.setTransClosingBalance(200d);
	    	list.add(detaildto);
	        return list;
	    }
}
