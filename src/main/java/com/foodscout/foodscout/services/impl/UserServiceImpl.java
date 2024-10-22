package com.foodscout.foodscout.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodscout.foodscout.models.User;
import com.foodscout.foodscout.models.dto.UserDTO;
import com.foodscout.foodscout.models.utils.mappers.UserMapper;
import com.foodscout.foodscout.repository.UserRepository;
import com.foodscout.foodscout.services.UserService;
import com.foodscout.foodscout.models.utils.mappers.UserMapper;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO getUserByEmail(String email) {
        User user = userRepository.getUserByEmail(email).get();
        return UserMapper.instance.userToUserDTOWithoutPassword(user);
    }

    @Override
    public void updateUser(UserDTO user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public void storeUser(UserDTO userFromControl) {

        User userToDb = UserMapper.instance.userDTOToUserDB(userFromControl);
        userRepository.save(userToDb);
    }
}
