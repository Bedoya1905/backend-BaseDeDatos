package com.basededatos.backend_baseDeDatos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "personajes")
public class Habilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String descripcion;
    private int incrementoAtk;
    private int incrementoDef;
    private int incrementoSp;

    @ManyToOne
    @JoinColumn(name = "personaje_id")
    private Long PersonajeId;

    public Habilidad(String nombre, String descripcion, int incrementoAtk, int incrementoDef, int incrementoSp) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.incrementoAtk = incrementoAtk;
        this.incrementoDef = incrementoDef;
        this.incrementoSp = incrementoSp;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public int getIncrementoAtk() { return incrementoAtk; }
    public int getIncrementoDef() { return incrementoDef; }
    public int getSp() { return incrementoSp; }

    @Override
    public String toString() {
        return String.format(
            "Habilidad[id=%d, nombre='%s', descripcion='%s', incrementoAtk='%d', incrementoDef='%d', incrementoSp='%d']",
            id, nombre, descripcion, incrementoAtk, incrementoDef, incrementoSp);
    }

}
