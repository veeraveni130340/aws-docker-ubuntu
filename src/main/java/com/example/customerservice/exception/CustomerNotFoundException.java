package com.example.customerservice.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CustomerNotFoundException extends RuntimeException {
    private long serialID = 1L;
    private String message;


    public CustomerNotFoundException(String message) {
        this.message = message;
    }
}