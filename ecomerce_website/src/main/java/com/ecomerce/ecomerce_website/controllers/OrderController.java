package com.ecomerce.ecomerce_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/load")
    public String loadOrders (){

        return "order/load_orders";
    }
}
