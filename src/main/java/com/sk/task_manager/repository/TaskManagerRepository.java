package com.sk.task_manager.repository;

import com.sk.task_manager.entities.Task;

import java.util.ArrayList;
import java.util.List;


public interface TaskManagerRepository {

    List<Task> tasks = new ArrayList<>();

    /**
     * Saves the given task to the repository.
     *
     * @param task the task to be saved
     */
    void saveTask(Task task);

    /**
     * Updates the given task in the repository.
     *
     * @param task the task to be updated
     */
    void updateTask(Task task);

    /**
     * Deletes the task with the given id from the repository.
     *
     * @param taskId the id of the task to be deleted
     */
    void deleteTask(int taskId);

    /**
     * Finds the task with the given id in the repository.
     *
     * @param taskId the id of the task to be found
     * @return the task with the given id, or null if no such task exists
     */
    Task getTask(int taskId);

    /**
     * Returns a list of all tasks in the repository.
     *
     * @return the list of all tasks in the repository
     */
    List<Task> getAllTasks();

}
