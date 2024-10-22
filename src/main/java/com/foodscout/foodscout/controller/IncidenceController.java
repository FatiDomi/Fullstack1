package com.foodscout.foodscout.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodscout.foodscout.models.Incidence;
import com.foodscout.foodscout.models.dto.IncidenceDTO;
import com.foodscout.foodscout.services.IncidenceService;

import jakarta.websocket.server.PathParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/incidence")

public class IncidenceController {

    @Autowired
    IncidenceService incidenceService;

    @GetMapping("/list")
    public ResponseEntity<List<Incidence>> getAllIncidences() {
        try {
            return ResponseEntity.ok(incidenceService.getAllIncidences());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("")
    public ResponseEntity<Void> storeIncidence(@RequestBody IncidenceDTO entity) {
        try {
            incidenceService.storeIncidence(entity);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
