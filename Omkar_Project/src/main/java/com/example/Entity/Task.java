package com.example.Entity;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Task {
	
	private int task_id;
	Project project;
	Parent parent;
	private Date task_startDate;
	private Date task_endDate;
	
	public Task(int task_id, Project project, Parent parent, Date task_startDate, Date task_endDate) {
		super();
		this.task_id = task_id;
		this.project = project;
		this.parent = parent;
		this.task_startDate = task_startDate;
		this.task_endDate = task_endDate;
	}

	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public Date getTask_startDate() {
		return task_startDate;
	}

	public void setTask_startDate(Date task_startDate) {
		this.task_startDate = task_startDate;
	}

	public Date getTask_endDate() {
		return task_endDate;
	}

	public void setTask_endDate(Date task_endDate) {
		this.task_endDate = task_endDate;
	}
	
}
