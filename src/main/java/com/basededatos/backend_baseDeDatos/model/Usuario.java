package com.basededatos.backend_baseDeDatos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String password;

    public Usuario(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Long getId() {return id;}
    public String getName() {return name;}
    public String getPassword() {return password;}

    @Override
    public String toString() {
        return String.format(
            "User[id=%d, name='%s', password='%s']",
            id, name, password);
    }
}
