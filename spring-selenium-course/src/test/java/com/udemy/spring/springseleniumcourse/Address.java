package com.udemy.spring.springseleniumcourse;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street;

    public Address(){
        this.street = "123 non main st";
    }

    public String getStreet(){
        return street;
    }
}