package com.ecomerce.ecomerce_website.services;

import com.ecomerce.ecomerce_website.entities.Address;
import com.ecomerce.ecomerce_website.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAddressList (){

        return addressRepository.findAll();
    }
}
