package com.example.service;

import com.example.Entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	@Autowired
    private final UserRepository _userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this._userRepository = userRepository;
    }

    public List<User> getUserFromRepo(String firstName) {
        List<User> user  = this._userRepository.findUser(firstName);
        System.out.println(user);
        if (user.size() ==  0 ) {
            return null;
        }
        return user;
    }
    
    public String createUserInRepo(User user) {
    	try 
    	{
    		User newUser = new User(user.getUser_id(),user.getFirstName(),user.getLastName(),user.getEmployeeId());
			this._userRepository.save(newUser);
			return "User created successfully";
    	}
    	catch(Exception ex) {
    		return ex.getMessage();
    	}
    }
}
