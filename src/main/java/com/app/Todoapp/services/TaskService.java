package com.app.Todoapp.services;

import com.app.Todoapp.models.Task;
import com.app.Todoapp.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskrepository;
    public TaskService(TaskRepository taskrepository){
        this.taskrepository=taskrepository;
    }
    //helps in gathering the task from db with the help of jpaRepository...
    public List<Task> getAllTasks(){
            return taskrepository.findAll();
    }
    //where created task storing in db.
    public void createTask(String title){
        Task task=new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskrepository.save(task);
    }
    public void deleteTask(Long id){
        taskrepository.deleteById(id);
    }
    public void toggleTask(Long id){
        Task task=taskrepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid task id"));
        task.setCompleted(!task.isCompleted());
        taskrepository.save(task);
    }
}
