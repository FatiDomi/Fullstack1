package com.foodscout.foodscout.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodscout.foodscout.models.Incidence;

@Repository
public interface CommentRepository extends JpaRepository<Incidence, Long>{

}
