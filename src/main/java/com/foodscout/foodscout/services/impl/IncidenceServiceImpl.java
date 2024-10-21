package com.foodscout.foodscout.services.impl;

import java.time.LocalDateTime;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodscout.foodscout.models.Incidence;
import com.foodscout.foodscout.models.User;
import com.foodscout.foodscout.models.dto.IncidenceDTO;
import com.foodscout.foodscout.repository.IncidenceRepository;
import com.foodscout.foodscout.services.IncidenceService;
import com.foodscout.foodscout.repository.UserRepository;

@Service
public class IncidenceServiceImpl implements IncidenceService {

    @Autowired
    IncidenceRepository incidenceRepository;

 
    @Autowired
    UserRepository userRepository;


    public List<IncidenceDTO> getIncidencesDtoByUser(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidencesDtoByUser'");
    }


    @Override
    public void storeIncidence(IncidenceDTO datos) {
      
        Optional<User> user   =  userRepository.findById(Long.parseLong(datos.getUserCreated()));
        if(user.isPresent()){
            Incidence incidence = new Incidence();
            incidence.setDescripcion(datos.getDescripcion());
            incidence.setCreatedAt(LocalDateTime.now());
            incidence.setPriority(datos.getPriority());
            incidence.setScope(datos.getScope());
            incidence.setUserCreated(user.get());
            incidenceRepository.save(incidence);
        }

        

    }

    @Override
    public void deleteIncidence(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteIncidence'");
    }

    @Override
    public List<IncidenceDTO> getIncidencesByUserName(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidencesByUserName'");
    }

    @Override
    public List<Incidence> getAllIncidences(){
        return incidenceRepository.findAll();
    }
    /*@Override
    public boolean storeIncidence(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'storeIncidence'");
    }*/

}
