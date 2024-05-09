package com.ecommerce.controllers;


import com.ecommerce.entities.User;
import com.ecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
            //EndPoints

    @Autowired
    UserService userService;


    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user){
       User newUser = userService.registerUser(user);
        return ResponseEntity.ok(newUser);

    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id){
        Optional<User> user = userService.getUserById(id);
        if(user.isPresent()){
            return ResponseEntity.ok((user.get()));
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }




}
