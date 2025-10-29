package com.basededatos.backend_baseDeDatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.basededatos.backend_baseDeDatos.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{ }
