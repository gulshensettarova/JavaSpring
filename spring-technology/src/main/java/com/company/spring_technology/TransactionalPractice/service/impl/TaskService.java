package com.company.spring_technology.TransactionalPractice.service.impl;


import com.company.spring_technology.mapper.TaskMapper;
import com.company.spring_technology.model.dao.entity.Category;
import com.company.spring_technology.model.dao.entity.Task;
import com.company.spring_technology.model.dao.repository.CategoryRepository;
import com.company.spring_technology.model.dao.repository.TaskRepository;
import com.company.spring_technology.model.dto.request.create.TaskCreateRequest;
import com.company.spring_technology.model.dto.request.update.TaskUpdateRequest;
import com.company.spring_technology.TransactionalPractice.service.inter.TaskInterface;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskService implements TaskInterface {
    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;
    private final CategoryRepository categoryRepository;

    public TaskService(TaskRepository taskRepository, TaskMapper taskMapper, CategoryRepository categoryRepository) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
        this.categoryRepository = categoryRepository;
    }


    @Override
    @Transactional
    public boolean createTask(TaskCreateRequest taskRequest) throws Exception {
        // Mövcud olan və ya yeni category'yi tapın/yaradın
        Category category = categoryRepository.findByName(taskRequest.getCategoryName());
        if (category == null) {
            category = new Category();
            category.setName(taskRequest.getCategoryName());
            categoryRepository.save(category);
        }

        Task task = new Task();
        task.setTitle(taskRequest.getTitle());
        task.setDescription(taskRequest.getDescription());
        task.setPriority(taskRequest.getPriority());
        task.setActive(taskRequest.isActive());
        task.setCategory(category);

        taskRepository.save(task);
        return true;
    }




}
