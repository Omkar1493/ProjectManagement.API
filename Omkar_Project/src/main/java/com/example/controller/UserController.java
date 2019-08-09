package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Entity.User;
import com.example.service.UserService;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@CrossOrigin
@RestController
public class UserController {
    private final UserService _service;

    @Autowired
    public UserController(UserService service){
        this._service = service;
    }
    
    @GetMapping(value = "/user")
    public Iterable<User> getMovies(@RequestParam(value="firstName", required = false) String fName) {
        return _service.getUserFromRepo(fName);
    }

    @PostMapping(value = "/user")
    public String createUser(@RequestBody User user, HttpServletResponse response) throws IOException
    {
        String val = _service.createUserInRepo(user);
        if(!val.equals("User created successfully")) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return "User Not Created";
        }
        else{
            return val;
        }
    }
    

    
}