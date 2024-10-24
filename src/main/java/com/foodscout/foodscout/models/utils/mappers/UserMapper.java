package com.foodscout.foodscout.models.utils.mappers;

import java.time.LocalDateTime;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.foodscout.foodscout.models.User;
import com.foodscout.foodscout.models.dto.UserDTO;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper instance = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "lastConnection", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    User userDTOToUserDB(UserDTO user);

    @Mapping(target = "id", ignore = true)
    User userDTOToUserWithoutId(UserDTO user);

    //condiciones complejas
    @Mapping(target = "password", ignore = true)
    UserDTO userToUserDTOWithoutPassword(User user);
    
    UserDTO userToUserDTOLastConnection(User user);
        
     
     // Marca el método con @Named para que MapStruct lo reconozca correctamente
    @Named("getCurrentTime")
    default LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }
}
