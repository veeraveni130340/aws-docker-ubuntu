package com.example.customerservice.service;
import com.example.customerservice.model.Customer;

import java.util.List;

public interface CustomerService {
    public Customer createCustomer(Customer customer);
    public List<Customer> getAllCustomer();
    public Customer getCustomerById(Integer id);
    public Customer updateCustomer(Integer id, Customer customer);
    public String DeleteCustomerById(Integer id);
}