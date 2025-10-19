package com.ecomerce.ecomerce_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/review")
public class ReviewController {

    @RequestMapping("/load")
    public String loadReviews (){

        return "review/load_reviews";
    }
}
