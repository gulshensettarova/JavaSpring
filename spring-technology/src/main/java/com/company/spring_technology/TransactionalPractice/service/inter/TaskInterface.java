package com.company.spring_technology.TransactionalPractice.service.inter;


import com.company.spring_technology.model.dao.entity.Category;
import com.company.spring_technology.model.dao.entity.Task;
import com.company.spring_technology.model.dto.request.create.TaskCreateRequest;
import com.company.spring_technology.model.dto.request.update.TaskUpdateRequest;

import java.util.List;

public interface TaskInterface {
    boolean createTask(TaskCreateRequest taskRequest) throws Exception;


}
