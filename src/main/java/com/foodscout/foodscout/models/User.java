package com.foodscout.foodscout.models;

import java.time.LocalDateTime;

import com.foodscout.foodscout.models.utils.Roles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "splint_user")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class User {
    // ctr + shift + alt + fabajo / farriba

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // me genera
    private long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "password", length = 30)
    private String password;
  
    @Enumerated(EnumType.STRING)
    @Column(name = "rol",nullable = false)
    private Roles rol;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "deletedAt")
    private LocalDateTime deletedAt;
    
    @Column(name = "updateAt")
    private LocalDateTime updateAt;

    @Column(name = "lastConnection")
    private LocalDateTime lastConnection;
}
