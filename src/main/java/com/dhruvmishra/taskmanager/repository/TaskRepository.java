package com.dhruvmishra.taskmanager.repository;

import com.dhruvmishra.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
