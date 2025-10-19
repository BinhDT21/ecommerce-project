package com.ecomerce.ecomerce_website.repositories;

import com.ecomerce.ecomerce_website.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
