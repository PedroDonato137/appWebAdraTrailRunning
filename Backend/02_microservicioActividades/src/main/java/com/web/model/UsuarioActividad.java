package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "usuario_actividad")
public class UsuarioActividad {

    @Id
    private Integer idUsuarioActividad;
    private Integer idUsuario;
    private Integer idActividad;
    private LocalDate fecha;
    private String urlStrava;

    // Constructor
    public UsuarioActividad(Integer idUsuarioActividad, Integer idUsuario, Integer idActividad, LocalDate fecha, String urlStrava) {
        this.idUsuarioActividad = idUsuarioActividad;
        this.idUsuario = idUsuario;
        this.idActividad = idActividad;
        this.fecha = fecha;
        this.urlStrava = urlStrava;
    }

    //Contructor vacio
    public UsuarioActividad() {
    }

    // Getter and Setter
    public Integer getIdUsuarioActividad() {
        return idUsuarioActividad;
    }

    public void setIdUsuarioActiviadad(Integer idUsuarioActividad) {
        this.idUsuarioActividad = idUsuarioActividad;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getUrlStrava() {
        return urlStrava;
    }

    public void setUrlStrava(String urlStrava) {
        this.urlStrava = urlStrava;
    }
}
