package com.gymapp.gym_project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gymapp.gym_project.Entity.User;
import com.gymapp.gym_project.Repository.IUserRepository;

@RequestMapping("/rest-api-user")
@RestController
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/add")
    public User addUser(@RequestBody User user){

        System.out.println("gelen var");
        return userRepository.save(user);
    }

    @GetMapping("/getAll")
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();

    }
    

}
