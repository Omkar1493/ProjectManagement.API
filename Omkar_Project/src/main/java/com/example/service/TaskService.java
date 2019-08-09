package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Task;
import com.example.repository.TaskRepository;

@Service

public class TaskService {
	@Autowired
    private final TaskRepository _taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this._taskRepository = taskRepository;
    }
    
    public String createTaskInRepo(Task task) {
	try 
	{
		Task newTask = new Task(task.getTask_id(),
				task.getProject(), 
				task.getParent(), 
				task.getTask_startDate(), 
				task.getTask_endDate());
		this._taskRepository.save(newTask);
		return "Task created successfully";
	}
	catch(Exception ex) {
		return ex.getMessage();
	}
}
}
