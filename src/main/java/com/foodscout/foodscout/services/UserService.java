package com.foodscout.foodscout.services;
import org.springframework.stereotype.Service;

import com.foodscout.foodscout.models.dto.UserDTO;

@Service
public interface UserService {

    UserDTO getUserByEmail(String email);
    void updateUser(UserDTO user);
    void deleteUser(Long id);
    void storeUser(UserDTO user);
}
