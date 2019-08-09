package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Project;
import com.example.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
    private final ProjectRepository _projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this._projectRepository = projectRepository;
    }
    
    public String createProjectInRepo(Project proj) {
    	try 
    	{
    		Project newUser = new Project(proj.getProject_id(), proj.getProject(),proj.getStartDate(), proj.getEndDate(), proj.getPriority());
			this._projectRepository.save(newUser);
			return "Project created successfully";
    	}
    	catch(Exception ex) {
    		return ex.getMessage();
    	}
    }
}
