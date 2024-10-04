package com.company.spring_technology.model.dao.repository;

import com.company.spring_technology.model.dao.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long> {
    Category findByName(String categoryName);
}
