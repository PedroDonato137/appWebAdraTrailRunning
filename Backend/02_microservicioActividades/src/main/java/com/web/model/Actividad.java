package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "actividad")
public class Actividad {

    @Id
    private Integer idActividad;
    private String nombre;
    private String descripcion;
    private Integer kilometros;
    private Integer desnivel;
    private String dificultad;
    private String tipo;
    private String urlWiki;

    // Constructor
    public Actividad(Integer idActividad, String nombre, String descripcion, Integer kilometros, Integer desnivel, String dificultad, String tipo, String urlWiki) {
        this.idActividad = idActividad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.kilometros = kilometros;
        this.desnivel = desnivel;
        this.dificultad = dificultad;
        this.tipo = tipo;
        this.urlWiki = urlWiki;
    }

    // Constructor vacio
    public Actividad() {
    }

    // Getter and Setter
    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getKilometros() {
        return kilometros;
    }

    public void setKilometros(Integer kilometros) {
        this.kilometros = kilometros;
    }

    public Integer getDesnivel() {
        return desnivel;
    }

    public void setDesnivel(Integer desnivel) {
        this.desnivel = desnivel;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUrlWiki() {
        return urlWiki;
    }

    public void setUrlWiki(String urlWiki) {
        this.urlWiki = urlWiki;
    }
}
