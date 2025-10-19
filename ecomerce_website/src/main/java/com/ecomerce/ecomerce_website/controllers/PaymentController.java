package com.ecomerce.ecomerce_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payment")
public class PaymentController {

    @RequestMapping("/load")
    public String loadPayments (){

        return "payment/load_payments";
    }
}
