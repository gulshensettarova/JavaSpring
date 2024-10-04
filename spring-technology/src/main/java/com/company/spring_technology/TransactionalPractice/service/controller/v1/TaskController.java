package com.company.spring_technology.TransactionalPractice.service.controller.v1;

import com.company.spring_technology.model.dao.entity.Category;
import com.company.spring_technology.model.dao.entity.Task;
import com.company.spring_technology.model.dto.request.create.TaskCreateRequest;
import com.company.spring_technology.TransactionalPractice.service.impl.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {
   private TaskService taskService;
   public TaskController(TaskService taskService) {
       this.taskService = taskService;
   }

   @PostMapping
    public boolean createTask(@RequestBody TaskCreateRequest request) throws Exception {

       return  taskService.createTask(request);
   }


}
