package com.company.spring_technology.model.dao.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Data
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "task_title")
    private String title;
    @Column(name = "task_description")
    private String description;
    @Column(name = "task_priority")
    private int priority;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="task_category",referencedColumnName = "id")
    private Category category;
    @Column(name = "is_active")
    private boolean isActive;
    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
