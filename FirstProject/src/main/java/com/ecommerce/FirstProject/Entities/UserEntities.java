package com.ecommerce.FirstProject.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class UserEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(nullable = false)
    private String name;


    @Column(unique = true)
    private String mail;

}
