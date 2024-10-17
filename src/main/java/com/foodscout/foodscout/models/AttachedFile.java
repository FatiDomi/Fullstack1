package com.foodscout.foodscout.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class AttachedFile {
 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String mimeType;
    @Column
    private String route;
    @ManyToOne
    @JoinColumn(name = "incidence_id")
    private Incidence incidence;
}
