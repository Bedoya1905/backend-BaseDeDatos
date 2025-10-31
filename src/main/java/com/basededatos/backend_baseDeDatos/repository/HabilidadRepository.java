package com.basededatos.backend_baseDeDatos.repository;

import com.basededatos.backend_baseDeDatos.model.Habilidad;
import com.basededatos.backend_baseDeDatos.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.basededatos.backend_baseDeDatos.model.Usuario;

import java.util.List;

public interface HabilidadRepository extends JpaRepository<Habilidad, Long> {

    List<Habilidad> findByPersonaje_Id(Long personajeId);

}
