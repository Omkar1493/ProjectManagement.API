package com.example.Entity;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Project {

	private int project_id;
	private String project;
	private Date startDate;
	private Date endDate;
	private String priority;
	
	public Project(int project_id, String project, Date startDate, Date endDate, String priority) {
		this.project_id = project_id;
		this.project = project;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
