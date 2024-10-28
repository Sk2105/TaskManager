package com.sk.task_manager.services;

import com.sk.task_manager.entities.Task;
import com.sk.task_manager.repository.TaskManagerRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskManagerServices implements TaskManagerRepository {
    /**
     * Saves a task to the repository.
     *
     * @param task Task to save
     */
    @Override
    public void saveTask(Task task) {
        tasks.add(task);
    }

    /**
     * Updates a task in the repository.
     * <p>
     * This method will match the task by ID and replace the name and description
     * of the matching task with the new values from the given task.
     *
     * @param task Task to update
     */
    @Override
    public void updateTask(Task task) {

        tasks.stream().map(
                t -> {
                    if (t.getId() == task.getId()) {
                        t.setName(task.getName());
                        t.setDescription(task.getDescription());
                        return t;
                    } else {
                        return t;
                    }
                }
        );
    }

    /**
     * Deletes a task from the repository by task ID.
     *
     * @param taskId ID of the task to be deleted
     */
    @Override
    public void deleteTask(int taskId) {

        tasks.removeIf(t -> t.getId() == taskId);

    }

    /**
     * Gets a task from the repository by task ID.
     *
     * @param taskId ID of the task to be retrieved
     * @return Task if found, otherwise null
     */
    @Override
    public Task getTask(int taskId) {
        return tasks.get(taskId) != null ? tasks.get(taskId) : null;
    }

    /**
     * Returns a list of all tasks in the repository.
     *
     * @return a list of all tasks
     */
    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }
}
