package com.foodscout.foodscout.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodscout.foodscout.models.Incidence;

import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<Incidence, Long>{

}
