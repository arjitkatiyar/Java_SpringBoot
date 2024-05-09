package com.ecommerce.services;


import com.ecommerce.entities.User;
import com.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    //User Should Be Created
    // We can check by ID is there any user


    @Autowired
    private UserRepository userRepository;

  public User registerUser(User user){
            return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id){
      return userRepository.findById(id);
    }

}
