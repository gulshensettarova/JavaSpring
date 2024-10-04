package com.company.spring_technology.mapper;



import com.company.spring_technology.model.dao.entity.Task;
import com.company.spring_technology.model.dto.request.create.TaskCreateRequest;
import com.company.spring_technology.model.dto.request.filter.TaskFilterRequest;
import com.company.spring_technology.model.dto.request.update.TaskUpdateRequest;
import com.company.spring_technology.model.dto.response.TaskResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskResponse ToDto(Task request);
    List<TaskResponse> ToDto(List<Task> requests);
    Task toEntity(TaskCreateRequest request);
    Task toEntity(TaskUpdateRequest request);
//    Task toEntity(TaskFilterRequest request);

}
