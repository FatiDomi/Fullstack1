package com.foodscout.foodscout.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "splint_user")
public class User {
    // ctr + shift + alt + fabajo / farriba

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // me genera
    private long id;
    @Column(name = "username", length = 8)
    private String username;

    @Column(name = "password", length = 8)
    private String password;

    @Column(name = "name", length = 8)
    private String name;

    @Column(name = "bithDate", length = 8)
    private String bithDate;

    @Column(name = "lasUpdate", length = 8)
    private LocalDateTime lasUpdate;

    @Column(name = "deletedAt", length = 8)
    private LocalDateTime deletedAt;

    @Column(name = "createdAt", length = 8)
    private LocalDateTime createdAt;

    public User(
        String username,
        String password,
        String name,
        String bithDate,
        LocalDateTime lasUpdate,
        LocalDateTime deletedAt,
        LocalDateTime createdAt
    ) {
        

        this.username = username;
        this.password = password;
        this.name = name;
        this.bithDate = bithDate;
        this.lasUpdate = lasUpdate;
        this.deletedAt = deletedAt;
        this.createdAt = createdAt;
    }

    // getters

    public long getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getBithDate() {
        return bithDate;
    }

    public LocalDateTime getLasUpdate() {
        return lasUpdate;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // setters
    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBithDate(String bithDate) {
        this.bithDate = bithDate;
    }

    public void setLasUpdate(LocalDateTime lasUpdate) {
        this.lasUpdate = lasUpdate;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}
