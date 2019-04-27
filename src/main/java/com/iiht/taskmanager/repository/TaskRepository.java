package com.iiht.taskmanager.repository;

import com.iiht.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	Task findByTaskId(Long id);
 
}
