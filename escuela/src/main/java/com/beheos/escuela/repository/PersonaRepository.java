package com.beheos.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beheos.escuela.modelo.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
