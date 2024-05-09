package com.ecommerce.FirstProject.Controllers;

import com.ecommerce.FirstProject.Entities.UserEntities;
import com.ecommerce.FirstProject.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/request")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserEntities> registerUser(@RequestBody UserEntities userEntities){

        UserEntities newUser = userService.registerUser(userEntities);
        return ResponseEntity.ok(newUser);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserEntities> getUserbyId(@PathVariable Long id){
        Optional<UserEntities> userEntities = userService.getUserId(id);

        if (userEntities.isPresent()){
            return ResponseEntity.ok(userEntities.get());
        }
        else
            return ResponseEntity.notFound().build();

    }

        @DeleteMapping("/{id}")
        public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "Deleted Successfully";
        }

        @PutMapping("/{id}")
        public UserEntities userUpdate(@PathVariable Long id, @RequestBody UserEntities userEntities){
        return userService.userUpdate(id, userEntities);

        }
}
