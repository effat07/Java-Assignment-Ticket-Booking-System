package com.hexaware.tbs.bean;


public class Customer {
    private String customer_name;
    private String email;
    private String phone_number;

    public Customer(String customer_name, String email, String phone_number) {
        this.customer_name = customer_name;
        this.email = email;
        this.phone_number = phone_number;
    }
    public String getCustomer_name() { 
    	return customer_name; 
    	}
}
