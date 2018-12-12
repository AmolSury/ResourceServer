package com.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Customer;

@RestController
public class CustomerController {

	@RequestMapping(value = "/user/getCustomerList", produces = "application/json")
    @ResponseBody
    public List<Customer> getEmployeesList() {
        List<Customer> customers = new ArrayList<>();
        Customer cust = new Customer();
        cust.setCustId("cust1");
        cust.setCustName("cust1");
        customers.add(cust);
        return customers;

    }

}
