package com.basededatos.backend_baseDeDatos.repository;

import com.basededatos.backend_baseDeDatos.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import com.basededatos.backend_baseDeDatos.model.Usuario;

public interface HabilidadRepository extends JpaRepository<Habilidad, Long> { }
