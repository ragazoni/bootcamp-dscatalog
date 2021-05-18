package com.devsuperior.dscatalog.repositories;

import com.devsuperior.dscatalog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//camada de acesso a dados
@Repository
public interface CategoryRepositories extends JpaRepository<Category, Long> {

    //vamos ter varias operações do banco de dados


}
