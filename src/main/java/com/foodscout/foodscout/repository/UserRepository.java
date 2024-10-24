package com.foodscout.foodscout.repository;

import com.foodscout.foodscout.models.User;

import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional <User> getUserByEmail(String email);

    
    //Optional<User> storeUser(UserDTO userDTO);
}
