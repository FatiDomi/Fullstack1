package com.foodscout.foodscout.services;


import org.springframework.stereotype.Service;

import com.foodscout.foodscout.models.Incidence;
import com.foodscout.foodscout.models.dto.IncidenceDTO;
import java.util.List;

@Service
public interface IncidenceService {

    //como devolvemos un listado de incidencias, con una lista
    List<IncidenceDTO> getIncidencesByUserName(String username);

    void storeIncidence(IncidenceDTO datos);
    //la clase q extienda de esta interfaz, va tener que cargar estos metodos q voy a definir. 
    void deleteIncidence(Long id);
    //porque el Long id?(......)
    List<Incidence> getAllIncidences();


}
