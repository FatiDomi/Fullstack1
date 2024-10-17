package com.foodscout.foodscout.models.dto;

import java.time.LocalDateTime;

import com.foodscout.foodscout.models.utils.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class UserDTO {
  private String name;
    private String email;
    private String password;
    private Roles rol;
    private Boolean active;
    private LocalDateTime lastConnection;
}
