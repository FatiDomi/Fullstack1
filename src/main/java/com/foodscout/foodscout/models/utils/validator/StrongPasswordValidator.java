package com.foodscout.foodscout.models.utils.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StrongPasswordValidator implements ConstraintValidator<StrongPassword, String> {
    private static final String PASSWORD = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$";

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {

        if(password == null){
            return false;
        }
        return password.matches(PASSWORD);
    }

    
}
