package com.foodscout.foodscout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodscout.foodscout.models.Incidence;



 //interfaz, como un contrato, hacer un modelo parecido a mi entidad ya q con ewllo me conecto a bbdd
//tiene el esquema de mi entidad y va a cotejar con mi bbdd

//jpa va heredar de Inciidence 

@Repository
public interface IncidenceRepository extends JpaRepository<Incidence, Long>{

   

}
