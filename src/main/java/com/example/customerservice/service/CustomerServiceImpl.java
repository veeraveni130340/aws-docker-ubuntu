package com.example.customerservice.service;

import com.example.customerservice.exception.CustomerNotFoundException;
import com.example.customerservice.dao.CustomerDao;
import com.example.customerservice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{
    private CustomerDao customerDao;

    @Autowired
    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerDao.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerDao.findAll();
    }

    @Override
    public Customer getCustomerById(Integer id) {
        Customer cus=customerDao.findById(id).get();
        if(cus==null)
        {
            throw new CustomerNotFoundException("Customer with given id not found!");
        }
        return cus;
    }

    @Override
    public Customer updateCustomer(Integer id, Customer customer) {
        Customer cus=customerDao.findById(id).get();
        if(cus==null)
        {
            throw new CustomerNotFoundException("Customer with given id not found!");
        }
        cus.setName(customer.getName());
        cus.setEmail(customer.getEmail());
        customerDao.save(cus);
        return cus;
    }

    @Override
    public String DeleteCustomerById(Integer id) {
        customerDao.deleteById(id);
        return "Deleted Successfully!";
    }
}