package com.company.spring_technology.model.dto.request.update;


import com.company.spring_technology.model.dao.entity.Category;

public class TaskUpdateRequest {
    private String title;
    private String description;
    private int priority;
    private Category category;
}
