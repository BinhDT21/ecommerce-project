package com.ecomerce.ecomerce_website.services;

import com.ecomerce.ecomerce_website.entities.User;
import com.ecomerce.ecomerce_website.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUserList (){
        return userRepository.findAll();
    }
}
