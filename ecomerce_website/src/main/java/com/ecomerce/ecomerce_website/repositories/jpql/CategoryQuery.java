package com.ecomerce.ecomerce_website.repositories.jpql;

import com.ecomerce.ecomerce_website.entities.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class CategoryQuery {

    @Autowired
    private EntityManager entityManager;

    @Value("${app.page-size}")
    private int pageSize;

    //Query get list categories
    public List<Category> findAll(Map<String, String> params) {
        String jpql = "SELECT c FROM Category c Where 1=1 ";


        String name = params.get("name");
        if(name!=null && !name.isEmpty()){
            jpql += "and c.name LIKE :name ";
        }

        //order by
        jpql += "ORDER BY c.id DESC";

        Query query = entityManager.createQuery(jpql);

        if(name!=null && !name.isEmpty()){
            query.setParameter("name", '%' + name + '%');
        }

        //pagination
        int page = params.get("page")!=null?Integer.parseInt(params.get("page")):0;
        int size = pageSize;

        query.setFirstResult(page * size); //get item in first position
        query.setMaxResults(size);

        return query.getResultList();
    }

    public long countTotal (Map<String, String> params){
        String jpql = "SELECT COUNT(c) FROM Category c WHERE 1=1 ";

        String name = params.get("name");
        if(name!=null && !name.isEmpty()){
            jpql += "and c.name like :name ";
        }

        Query query = entityManager.createQuery(jpql);

        if(name!=null && !name.isEmpty()){
            query.setParameter("name", '%' + name + '%');
        }


        return (long)query.getSingleResult();
    }
}
