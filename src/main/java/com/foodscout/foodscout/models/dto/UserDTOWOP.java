package com.foodscout.foodscout.models.dto;

import java.time.LocalDateTime;

import com.foodscout.foodscout.models.utils.enums.Roles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTOWOP {
    // sin password
    
    private Long id;
    private String name;
    private String email;
    private Roles rol;
    private Boolean active;
    private LocalDateTime lastConnection;

}
