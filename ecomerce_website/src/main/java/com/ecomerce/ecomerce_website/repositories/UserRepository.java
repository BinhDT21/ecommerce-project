package com.ecomerce.ecomerce_website.repositories;

import com.ecomerce.ecomerce_website.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
