package com.ecomerce.ecomerce_website.controllers.api;

import com.ecomerce.ecomerce_website.entities.Address;
import com.ecomerce.ecomerce_website.entities.Category;
import com.ecomerce.ecomerce_website.entities.User;
import com.ecomerce.ecomerce_website.services.AddressService;
import com.ecomerce.ecomerce_website.services.CategoryService;
import com.ecomerce.ecomerce_website.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/test")
public class test {

    @Autowired
    private UserService userService;
    @Autowired
    private AddressService addressService;
    @Autowired
    private CategoryService categoryService;

    //test api
    @GetMapping("/first")
    public ResponseEntity<String> test (){

        return ResponseEntity.ok("Test successfully");
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> test_get_list_user (){

        List<User> users = userService.getUserList();

        return ResponseEntity.ok(users);
    }

    @GetMapping("/addresses")
    public ResponseEntity<List<Address>> test_get_list_address (){

        List<Address> addresses = addressService.getAddressList();

        System.out.println(addresses.size());

        return ResponseEntity.ok(addresses);
    }

    //test create category
    @PostMapping("/category")
    public ResponseEntity<Category> test_create_category (@ModelAttribute Category category){
        Category c = categoryService.createCategory(category);
        return ResponseEntity.status(HttpStatus.CREATED).body(c);
    }

//    @GetMapping("/categories")
//    public ResponseEntity<List<Category>> test_get_list_cate (){
//
//        List<User> users = userService.getUserList();
//
//
//        return ResponseEntity.ok(categories);
//    }

}
