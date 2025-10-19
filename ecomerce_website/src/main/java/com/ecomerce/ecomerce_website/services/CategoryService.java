package com.ecomerce.ecomerce_website.services;

import com.ecomerce.ecomerce_website.entities.Category;
import com.ecomerce.ecomerce_website.repositories.CategoryRepository;
import com.ecomerce.ecomerce_website.repositories.jpql.CategoryQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@Service
public class CategoryService {

    @Value("${app.page-size}")
    private int pageSize;

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryQuery categoryQuery;

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Page<Category> loadCategories(Map<String, String> params) {


        List<Category> categoryList = categoryQuery.findAll(params);
        int page = params.get("page")!=null?Integer.parseInt(params.get("page")):0;
        long totalItems = categoryQuery.countTotal(params);

        return new PageImpl<>(categoryList, PageRequest.of(page, pageSize), totalItems);

        // Ví dụ: PageRequest.of(1, 10) → lấy trang số 1 (tức là trang thứ 2, vì index từ 0), mỗi trang có 10 item.
    }

    public Category loadCategoryById(int categoryId) {
        return categoryRepository.findById(categoryId).orElse(null);
    }

    public Category saveCategory(Category category) {

        return categoryRepository.save(category);
    }

    public void deleteCategory(int cateId) {
        categoryRepository.deleteById(cateId);
    }


}
