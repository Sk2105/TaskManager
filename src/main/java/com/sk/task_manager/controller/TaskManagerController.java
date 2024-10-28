package com.sk.task_manager.controller;

import com.sk.task_manager.entities.Task;
import com.sk.task_manager.services.TaskManagerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tasks")
public class TaskManagerController {

    @Autowired
    private TaskManagerServices taskManagerRepository;

    /**
     * @return a list of all tasks
     */
    @GetMapping
    public ResponseEntity<?> getAllTasks() {
        return new ResponseEntity<>(
                taskManagerRepository.getAllTasks(),
                HttpStatus.ACCEPTED
        );
    }

    /**
     * Create a new task in the task manager
     *
     * @param task the task to create
     * @return a ResponseEntity indicating success
     */
    @PostMapping
    public ResponseEntity<?> createTask(@RequestBody Task task) {
        taskManagerRepository.saveTask(task);
        return new ResponseEntity<>(
                "Task created successfully",
                HttpStatusCode.valueOf(201)
        );
    }

    /**
     * Update a task in the task manager
     *
     * @param task the task to update
     * @return a ResponseEntity indicating success
     */
    @PutMapping
    public ResponseEntity<?> updateTask(@RequestBody Task task) {
        taskManagerRepository.updateTask(task);
        return new ResponseEntity<>(
                "Task updated successfully",
                HttpStatusCode.valueOf(201)
        );
    }

    /**
     * Delete a task from the task manager
     *
     * @param id the id of the task to delete
     * @return a ResponseEntity indicating success
     */
    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteTask(@PathVariable int id) {
        taskManagerRepository.deleteTask(id);
        return new ResponseEntity<>(
                "Task deleted successfully",
                HttpStatusCode.valueOf(201)
        );
    }

    /**
     * Retrieve a task by its ID from the task manager
     *
     * @param id the ID of the task to retrieve
     * @return a ResponseEntity containing the task, or null if not found
     */
    @GetMapping("{id}")
    public ResponseEntity<?> getTask(@PathVariable int id) {
        return new ResponseEntity<>(
                taskManagerRepository.getTask(id),
                HttpStatusCode.valueOf(201)
        );
    }
}
