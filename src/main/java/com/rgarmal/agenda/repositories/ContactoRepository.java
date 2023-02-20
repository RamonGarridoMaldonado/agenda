package com.rgarmal.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rgarmal.agenda.models.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
    
}
