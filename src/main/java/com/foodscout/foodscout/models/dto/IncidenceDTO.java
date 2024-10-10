package com.foodscout.foodscout.models.dto;

import java.time.LocalDateTime;

import com.foodscout.foodscout.models.Incidence;
import com.foodscout.foodscout.models.User;
import com.foodscout.foodscout.servicesImpl.IncidenceServiceImpl;

public class IncidenceDTO {

    private Long id;
    private String category;
    private String descripcion;
    private String priority;
    private User userCreated;
    
    public IncidenceDTO(Long id,String category, String descripcion, String priority, User userCreated) {
        this.id = id;
        this.category = category;
        this.descripcion = descripcion;
        this.priority = priority;
        this.userCreated = userCreated;
    }

    public String getCategory() {
        return category;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPriority() {
        return priority;
    }

    public User getUserCreated() {
        return userCreated;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setUserCreated(User userCreated) {
        this.userCreated = userCreated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean storeIncidence(IncidenceServiceImpl incidenceServiceImpl) {
        Incidence incidence = new Incidence();
        incidence.setCategory(getCategory());
        incidence.setDescripcion(getDescripcion());
        incidence.setPriority(getPriority());
        incidence.setCreatedAt(LocalDateTime.now());
        incidence.setUserCreated(null);
        //  incidenceRepository.save(incidence);
        Incidence response = incidenceServiceImpl.incidenceRepository.save(incidence);
    
        if(response == null){
            return true;
        }else{
            return false;
        }
      
        
    }

    

}
