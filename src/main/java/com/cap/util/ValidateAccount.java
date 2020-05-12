package com.cap.util;



import com.cap.entities.AccountManagement;
import com.cap.entities.Transaction;

import com.cap.exceptions.*;



public class ValidateAccount {
	public static void validateAccountId(Transaction transaction) {

		if (transaction.transAccountId.length() != 12)
				 {
			throw new IncorrectAccountIDException("Account ID is Invalid");
		}
	}


}
