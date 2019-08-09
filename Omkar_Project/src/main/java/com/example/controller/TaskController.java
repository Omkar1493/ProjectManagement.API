package com.example.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Task;
import com.example.service.TaskService;

@CrossOrigin
@RestController
public class TaskController {
	private final TaskService _service;
	
	@Autowired
    public TaskController(TaskService service){
        this._service = service;
    }
	    
	@PostMapping(value = "/task")
    public String createProject(@RequestBody Task task, HttpServletResponse response) throws IOException
    {
        String val = _service.createTaskInRepo(task);
        if(!val.equals("Task created successfully")) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return "Task Not Created";
        }
        else{
            return val;
        }
    }
}
