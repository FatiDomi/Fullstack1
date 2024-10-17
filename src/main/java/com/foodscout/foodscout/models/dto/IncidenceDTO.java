package com.foodscout.foodscout.models.dto;



import java.lang.foreign.MemorySegment.Scope;

import com.foodscout.foodscout.models.utils.Priorities;
import com.foodscout.foodscout.models.utils.Scopes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class IncidenceDTO {

    private Long id;
    private String descripcion;
    private Priorities priority;
    private Scopes scope;
    private String userCreated;
    

}
