package com.foodscout.foodscout.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;

@Entity
@Table(name = "chat")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Chat {
 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String message;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User autor;
    @ManyToOne
    @JoinColumn(name = "incidence_id")
    private Incidence incidence;
}
