package com.foodscout.foodscout.services;


import org.springframework.stereotype.Service;
import com.foodscout.foodscout.models.dto.IncidenceDTO;
import java.util.List;

@Service
public interface IncidenceService {

    //como devolvemos un listado de incidencias, con una lista
    IncidenceDTO getIncidencesById(Long id);
    List<IncidenceDTO> getIncidencesByUserName(String username);

    boolean storeIncidence(String entity);
    //la clase q extienda de esta interfaz, va tener que cargar estos metodos q voy a definir. 

    void deleteIncidence(Long id);
    //porque el Long id?(......)

}
