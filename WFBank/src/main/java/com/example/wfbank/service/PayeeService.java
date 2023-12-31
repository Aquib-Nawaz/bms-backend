package com.example.wfbank.service;

import java.util.List;

import com.example.wfbank.model.Payee;

public interface PayeeService {
	Payee savePayee(Payee payee);
	List<Payee> getAllPayee();
	Payee getPayeeById(long id);
	void updatePayee(Payee payee, long id);
	void deletePayee(long id);
	List<Payee> getPayeesByAccNumber(long accNumber);
	boolean payeeExists(long accNo, long benNo);
}
