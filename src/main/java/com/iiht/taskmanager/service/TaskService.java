package com.iiht.taskmanager.service;

import com.iiht.taskmanager.dto.TaskDto;
import com.iiht.taskmanager.entity.Task;

import java.util.List;

public interface TaskService  {
	Task addTask(Task task);
	List<Task> getAllTasks();
	Task updateTask(Task task);
	Task getTaskById(Long id);
	Task getTaskEntityFromTaskDto(TaskDto taskDto);
	TaskDto getTaskDtoFromTaskEntity(Task task);
}
