package com.iiht.taskmanager.service;

import com.iiht.taskmanager.dto.ParentTaskDto;
import com.iiht.taskmanager.entity.ParentTask;

import java.util.List;

public interface ParentTaskService {
    List<ParentTask> getAllParentTasks();
    ParentTask getParentTaskByParentId(Long id);
    ParentTaskDto getParentTaskDtoFromParentTaskEntity(ParentTask parentTask);
}
