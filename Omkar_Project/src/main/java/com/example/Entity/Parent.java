package com.example.Entity;

import javax.persistence.Entity;

@Entity
public class Parent {

	private int parentId;	
	private String parent;

	public Parent(int parentId, String parent) {
		super();
		this.parentId = parentId;
		this.parent = parent;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
		
	
}
