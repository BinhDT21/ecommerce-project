package com.ecomerce.ecomerce_website.controllers.api;

import com.ecomerce.ecomerce_website.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
public class CategoryRestController {


    @Autowired
    private CategoryService categoryService;

    //API for delete category
    @DeleteMapping("/delete/{cateId}")
    public ResponseEntity<Void> deleteCategory (@PathVariable(name = "cateId") int cateId){
        categoryService.deleteCategory(cateId);

        return ResponseEntity.noContent().build();
    }
}
