package com.ecomerce.ecomerce_website.controllers;

import com.ecomerce.ecomerce_website.entities.Category;
import com.ecomerce.ecomerce_website.services.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/load")
    public String loadCategories(Model model, @RequestParam Map<String, String> params) {

        Page<Category> listCate = categoryService.loadCategories(params);
        int page =params.get("page")!=null?Integer.parseInt(params.get("page")):0;

        model.addAttribute("categories", listCate);

        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", listCate.getTotalPages());

        return "category/load_categories";
    }

    @RequestMapping("/add")
    public String addCategory(Model model) {

        Category category = new Category();
        model.addAttribute("category", category);

        return "category/add_category";
    }

    //API for editing category
    @RequestMapping("/edit/{cateId}")
    public String editCategory(Model model, @PathVariable(name = "cateId") int cateId) {

        Category category = categoryService.loadCategoryById(cateId);

        model.addAttribute("category", category);
        return "category/edit_category";
    }

    //API for create
    @PostMapping("/save")
    public String saveCategory(@ModelAttribute @Valid Category category, BindingResult bindingResult) {
        if(!bindingResult.hasErrors()){
            categoryService.saveCategory(category);
            System.out.println("Save category succeed !!");
            return "redirect:/category/load";
        }{
            System.out.println("Save category not succeed !!");
            return "category/add_category";
        }
    }

    //API for update
//    public String updateCategory (@ModelAttribute @Valid Category category, BindingResult bindingResult){
//
//    }




}
