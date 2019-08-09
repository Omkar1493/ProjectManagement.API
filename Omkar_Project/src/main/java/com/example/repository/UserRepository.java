package com.example.repository;

import com.example.Entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	@Query("SELECT u FROM USER u where u.firstName like concat('%',:firstName,'%')")
    List<User> findUser(@Param("firstName") String firstName);
}