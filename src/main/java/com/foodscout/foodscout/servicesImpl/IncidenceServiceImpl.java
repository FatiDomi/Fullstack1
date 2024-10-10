package com.foodscout.foodscout.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodscout.foodscout.models.dto.IncidenceDTO;
import com.foodscout.foodscout.repository.IncidenceRepository;
import com.foodscout.foodscout.services.IncidenceService;


@Service
public class IncidenceServiceImpl implements IncidenceService {

    @Autowired

    IncidenceRepository incidenceRepository;

    @Override
    public IncidenceDTO getIncidencesById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidencesById'");
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
    public boolean storeIncidence(String entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'storeIncidence'");
    }

   

}
