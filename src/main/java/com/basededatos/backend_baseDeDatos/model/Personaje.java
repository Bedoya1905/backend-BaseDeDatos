package com.basededatos.backend_baseDeDatos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "personajes")
public class Personaje {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String tipo;
    private String descripcion;
    private int atk;
    private int def;
    private int sp;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Personaje(String nombre, String tipo, String descripcion, int atk, int def, int sp) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.atk = atk;
        this.def = def;
        this.sp = sp;
    }

    public Long getId() {return id;}
    public String getNombre() {return nombre;}
    public String getTipo() {return tipo;}
    public String getDescripcion() {return descripcion;}
    public int getAtk() {return atk;}
    public int getDef() {return def;}
    public int getSp() {return sp;}

    @Override
    public String toString() {
        return String.format(
            "Personaje[id=%d, nombre='%s', tipo='%s', descripcion='%s', atk='%d', def='%d', sp='%d']",
            id, nombre, tipo, descripcion, atk, def, sp);
    }

}
