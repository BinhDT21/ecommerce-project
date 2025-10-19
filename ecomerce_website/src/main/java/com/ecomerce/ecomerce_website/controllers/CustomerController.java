package com.ecomerce.ecomerce_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/load")
    public String loadCustomers (){

        return "customer/load_customers";
    }
}
