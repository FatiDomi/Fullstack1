package com.foodscout.foodscout.models;


import java.time.LocalDateTime;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "incidence")
public class Incidence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // me genera

    private Long id;

    @Column
    private String category;//CategoryClass

    @Column
    private String descripcion;

    @Column
    private String priority; // priorityClass

    @Column
    private LocalDateTime  createdAt;

    
    @Column(nullable = true)
    private LocalDateTime  updateAt;
    

    @Column
    @Nullable
    private LocalDateTime  deletedAt;

    //

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userCreated;

    public Incidence(){}

    public Incidence(
        Long id,
        String category,
        String descripcion,
        String priority,
        LocalDateTime  createdAt,
        LocalDateTime  updateAt,
        LocalDateTime  deletedAt,
        User userCreated

    ){
        this.category=category;
        this.id = id;
        this.category = category;
        this.descripcion = descripcion;
        this.priority = priority;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.deletedAt = deletedAt;
        this.userCreated = userCreated;
        
    }

    public Long getId() {
        return id;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public User getUserCreated() {
        return userCreated;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public void setUserCreated(User userCreated) {
        this.userCreated = userCreated;
    }

    

    
  
}
