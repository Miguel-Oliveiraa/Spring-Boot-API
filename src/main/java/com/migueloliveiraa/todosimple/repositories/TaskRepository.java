package com.migueloliveiraa.todosimple.repositories;

import java.util.List;
import java.util.Optional;

import com.migueloliveiraa.todosimple.models.Task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser_Id(Long id);

}
