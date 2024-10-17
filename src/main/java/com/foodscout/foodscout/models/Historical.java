package com.foodscout.foodscout.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;

@Entity
@Data
@Table(name = "historical")
@AllArgsConstructor
@NoArgsConstructor
public class Historical {
 @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="createdAt")
    private LocalDateTime createdAt;
    @Column(name="deletedAt")
    private LocalDateTime deletedAt;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User autor;
    @ManyToOne
    @JoinColumn(name = "incidence_id")
    private Incidence incidence;
}
