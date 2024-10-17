package com.foodscout.foodscout.repository;
import com.foodscout.foodscout.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
