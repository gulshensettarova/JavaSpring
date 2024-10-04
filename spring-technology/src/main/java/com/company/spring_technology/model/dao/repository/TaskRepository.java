package com.company.spring_technology.model.dao.repository;

import com.company.spring_technology.model.dao.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    Task findByTitle(String title);
    List<Task> findByIsActive(boolean isActive);
    @Query(value = "SELECT * FROM task t LEFT JOIN category c ON t.task_category = c.id WHERE c.category_name = :categoryName", nativeQuery = true)
    List<Task> findByCategory(@Param("categoryName") String categoryName);
}
