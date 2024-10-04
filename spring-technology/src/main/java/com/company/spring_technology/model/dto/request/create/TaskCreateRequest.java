package com.company.spring_technology.model.dto.request.create;

import com.company.spring_technology.model.dao.entity.Category;
import lombok.Data;

@Data
public class TaskCreateRequest {
    private String title;
    private String description;
    private int priority;
    private boolean isActive;
    private String categoryName;
}
