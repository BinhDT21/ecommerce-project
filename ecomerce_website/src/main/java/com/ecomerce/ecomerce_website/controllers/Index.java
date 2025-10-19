package com.ecomerce.ecomerce_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {

    @RequestMapping("/")
    public String index (){

        //Home page will display the total amount of each object.
        //show statistic chart

        return "index";
    }

    @RequestMapping("/dashboard")
    public String dashboard (){
        return "index";
    }
}
