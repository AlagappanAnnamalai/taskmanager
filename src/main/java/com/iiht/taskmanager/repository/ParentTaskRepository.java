package com.iiht.taskmanager.repository;

import com.iiht.taskmanager.entity.ParentTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentTaskRepository extends JpaRepository<ParentTask, Long> {
    ParentTask findByParentId(Long id);
}
