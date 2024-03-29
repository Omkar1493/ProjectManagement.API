package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
  
}
