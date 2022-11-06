package com.cydeo.service;

import com.cydeo.dto.TaskDTO;
import com.cydeo.entity.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {

    List<TaskDTO> listAllTasks();
    void save(TaskDTO dto);
    void update(TaskDTO dto);
    void delete(Long id);
    TaskDTO findById(Long id);


    int totalNonCompletedTask(String projectCode);

    int totalCompletedTask(String projectCode);


}
