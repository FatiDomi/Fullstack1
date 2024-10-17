package com.foodscout.foodscout.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String content;
    @Column(name="createdAt")
    private LocalDateTime createdAt;
    @Column(name="deletedAt", nullable = true)
    private LocalDateTime deletedAt;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User autor;
    @ManyToOne
    @JoinColumn(name = "incidence_id")
    private Incidence incidence;
}
