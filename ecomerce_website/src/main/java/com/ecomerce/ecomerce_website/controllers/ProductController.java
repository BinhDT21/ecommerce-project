package com.ecomerce.ecomerce_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/load")
    public String loadProducts (){

        return "product/load_products";
    }
}
