package com.devsuperior.dscatalog.services;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServices {
    //camada de serviço

    @Autowired
    private CategoryRepositories repositories;

    public List<Category> findAll(){
        return repositories.findAll();
    }

}
