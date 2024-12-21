package com.web.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario_actividad")
public class UsuarioActividad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuarioActividad;
    private Integer idUsuario;
    private Integer idActividad;
    private Integer fecha;
    private String urlStrava;

    // Constructor
    public UsuarioActividad(Integer idUsuarioActividad, Integer idUsuario, Integer idActividad, Integer fecha, String urlStrava) {
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

    public Integer getFecha() {
        return fecha;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    public String getUrlStrava() {
        return urlStrava;
    }

    public void setUrlStrava(String urlStrava) {
        this.urlStrava = urlStrava;
    }
}
