package com.basededatos.backend_baseDeDatos.repository;

import com.basededatos.backend_baseDeDatos.model.Personaje;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.basededatos.backend_baseDeDatos.model.Usuario;

public interface PersonajeRepository extends JpaRepository<Personaje, Long> {

    List<Personaje> findByUsuarioId(Long usuario);

 }
