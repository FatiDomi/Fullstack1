package com.foodscout.foodscout.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodscout.foodscout.services.IncidenceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")

public class IncidenceController {

    @Autowired
    IncidenceService incidenceService;

    @PostMapping("/incidence")
    public ResponseEntity<Integer> postMethodName(@RequestBody String entity) {
        try {
            incidenceService.storeIncidence(entity);
            return new ResponseEntity<Integer>(1, HttpStatus.BAD_REQUEST); 
        } catch (Exception e) {
            return new ResponseEntity<Integer>(0, HttpStatus.BAD_REQUEST);        
        }
        
       
    }

}
