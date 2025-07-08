package com.gymapp.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gymapp.Entities.User;
import com.gymapp.Repository.IUserRepository;

@RequestMapping("/rest-api-user")
@RestController
public class UserController {

    private IUserRepository userRepository;

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }
    

}
