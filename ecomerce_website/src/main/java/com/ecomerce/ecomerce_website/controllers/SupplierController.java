package com.ecomerce.ecomerce_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/supplier")
public class SupplierController {

    @RequestMapping("/load")
    public String loadProducts (){

        return "supplier/load_suppliers";
    }
}
