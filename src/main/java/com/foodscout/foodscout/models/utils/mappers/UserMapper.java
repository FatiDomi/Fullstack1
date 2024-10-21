package com.foodscout.foodscout.models.utils.mappers;


import java.time.LocalDateTime;

import com.foodscout.foodscout.models.User;
import com.foodscout.foodscout.models.dto.UserDTO;
import com.foodscout.foodscout.models.dto.UserDTOWOP;
import com.foodscout.foodscout.models.utils.enums.Roles;

import jakarta.persistence.Id;

public class UserMapper {

    public static UserDTO userToDTO(User user) {
        UserDTO response = new UserDTO();
        if(response != null){
            response.setId(user.getId());
            response.setName(user.getName());
            response.setEmail(user.getEmail());
            response.setRol(user.getRol());
            response.setActive(user.getActive());
            response.setPassword(user.getPassword());
            response.setLastConnection(user.getLastConnection());
        }
        return response;
    }

    public static UserDTOWOP userToDtoWOP(User user){
        UserDTOWOP response;
        if(user != null){
            response = new UserDTOWOP(
            user.getId(),
            user.getName(),
            user.getEmail(),
            user.getActive(),
            user.getLastConnection()
            );
           // return response;
        }else{
            response = new UserDTOWOP();
        }
        return response;
    }

    public static User dtoToUserCreated(UserDTO user){
        User response = new User();
        if(user != null){
           response.setId(user.getId());
           response.setName(user.getName());
           response.setEmail(user.getEmail());
           response.setPassword(user.getPassword());
           response.setRol(user.getRol());
           response.setCreatedAt(LocalDateTime.now());
           response.setActive(user.getActive());
           //response.setDeletedAt();
           //response.setUpdateAt();
           //response.setLastConnection(null);

        }
        if(user.getCreatedAt() == null){
            response.setCreatedAt(LocalDateTime.now());
        }else{
            response.setCreatedAt(user.getCreatedAt());
            if (user.getDeleteAt() != null){
                response.setDeletedAt(user.getDeleteAt());
            }else if (user.getUpdateAt() != null){
    
            }
        }
        
        return response;
    }
}
