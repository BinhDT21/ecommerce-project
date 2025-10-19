package com.ecomerce.ecomerce_website.repositories;

import com.ecomerce.ecomerce_website.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
