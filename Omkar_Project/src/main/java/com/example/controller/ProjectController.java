package com.example.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Project;
import com.example.service.ProjectService;

@CrossOrigin
@RestController
public class ProjectController {
	private final ProjectService _service;
	
	@Autowired
    public ProjectController(ProjectService service){
        this._service = service;
    }
	    
	@PostMapping(value = "/project")
    public String createProject(@RequestBody Project user, HttpServletResponse response) throws IOException
    {
        String val = _service.createProjectInRepo(user);
        if(!val.equals("Project created successfully")) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return "Project Not Created";
        }
        else{
            return val;
        }
    }
}
