package com.cap.dao;

import java.util.List;

import org.cap.bookingmgt.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.entities.Transaction;
@Repository
public interface IPassbookDao extends JpaRepository<Transaction, String>{
	List<Transaction> updatePassbook();
	List<Transaction> accountSummary();
	boolean accountValidation(Account account);
	boolean updateLastUpdated(Account account);
}
