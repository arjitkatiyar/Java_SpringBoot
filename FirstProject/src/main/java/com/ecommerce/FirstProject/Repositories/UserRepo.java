package com.ecommerce.FirstProject.Repositories;

import com.ecommerce.FirstProject.Entities.UserEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntities, Long> {
}
