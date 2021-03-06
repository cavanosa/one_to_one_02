package com.tutorial.onetoone02.repository;

import com.tutorial.onetoone02.entity.Ciudadano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadanoRepository extends JpaRepository<Ciudadano, Integer> {
}
