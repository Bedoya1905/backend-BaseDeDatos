package com.basededatos.backend_baseDeDatos.repository;

import com.basededatos.backend_baseDeDatos.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import com.basededatos.backend_baseDeDatos.model.Usuario;

public interface PersonajeRepository extends JpaRepository<Personaje, Long> { }
