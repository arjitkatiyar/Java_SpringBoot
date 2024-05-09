package com.ecommerce.FirstProject.Services;

import com.ecommerce.FirstProject.Entities.UserEntities;
import com.ecommerce.FirstProject.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;


    public UserEntities registerUser(UserEntities userEntities){
        return userRepo.save(userEntities);
    }

    public Optional<UserEntities> getUserId(Long id){
        return userRepo.findById(id);
    }

    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }

    public UserEntities userUpdate(Long id, UserEntities userEntities){
//        userEntities.setId(id);
        userEntities.setName(userEntities.getName());
        userEntities.setMail(userEntities.getMail());
        return userRepo.save(userEntities);
    }

}
