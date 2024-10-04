package com.company.spring_technology.model.dto.request.filter;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class TaskFilterRequest {
    private String title;
    private String description;
    private String category;
    private int priority;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean isActive;
}
