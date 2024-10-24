package com.foodscout.foodscout.models.dto;

import java.time.LocalDateTime;

import com.foodscout.foodscout.models.utils.enums.Roles;
import com.foodscout.foodscout.models.utils.validator.StrongPassword;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
  private Long id;
  
  @NotBlank(message= "Name may not be blank")
  @NotNull(message = "se debe agregar un no,bre")
  private String name;
  @Email
  @NotNull(message = "Se debe agragar un email")
  @NotBlank(message = "email may not be blank")
  private String email;
  @Min(value= 8)
  @Max(value = 30)
  @StrongPassword
  private String password;
  private Roles rol;
  private Boolean active;
  private LocalDateTime lastConnection;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private LocalDateTime deletedAt;
}
