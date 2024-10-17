package com.foodscout.foodscout.models;


import java.time.LocalDateTime;

import com.foodscout.foodscout.models.utils.Priorities;
import com.foodscout.foodscout.models.utils.Scopes;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "incidence")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Incidence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // me genera
    private Long id;

    @Column
    private String descripcion;


    //ANOTACION: HACE UN CAMBIO A UNA VARIABLE ESPECIFICA. EXTEREOTIPO: DENTRO DE UNA INTERFAZ,OBJETO.. VOY A GENERRRLE UNA FUNCION ESPECIFICA
    @Column
    @Enumerated(EnumType.STRING)
    private Priorities priority; // priorityClass

    @Column
    @Enumerated(EnumType.STRING)
    private Scopes scope;

    @Column
    private LocalDateTime  createdAt;
    @Column(nullable = true)

    private LocalDateTime  updateAt;
    @Column(name = "deletedAt",nullable = true)
    private LocalDateTime  deletedAt;

    //

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userCreated; 
}
