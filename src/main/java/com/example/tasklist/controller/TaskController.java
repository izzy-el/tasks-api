package com.example.tasklist.controller;

import java.util.List;
import java.util.Optional;

import com.example.tasklist.model.Task;
import com.example.tasklist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/task/{id}")
    public Optional<Task> getTaskById(@PathVariable("id") int id) {
        return taskRepository.findById(id);
    }

    @PostMapping("/tasks/")
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @PutMapping("/tasks/")
    public Task updateTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @DeleteMapping("/task/{id}")
    public void deleteTask(@PathVariable("id") int id) {
        taskRepository.deleteById(id);
    }
}
