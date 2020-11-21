package sh.services;

import org.springframework.transaction.annotation.Transactional;

import sh.entities.Customer;

public interface CustomerService {

	Customer findCustomer(String email);

	Customer findCustomer(String email, String password);

	void addCustomer(Customer cust);

}