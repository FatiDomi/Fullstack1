package com.foodscout.foodscout.models.dto;

import com.foodscout.foodscout.models.utils.enums.Priorities;
import com.foodscout.foodscout.models.utils.enums.Scopes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class IncidenceDTO {
    //ctrl+alt+shif+flechaabajo
    private String descripcion;
    private Priorities priority;
    private Scopes scope;
    private String userCreated;
    

}
