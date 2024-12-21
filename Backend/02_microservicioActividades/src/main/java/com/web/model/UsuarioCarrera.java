package com.web.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario_carrera")
public class UsuarioCarrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarrerra;
    private Integer idUsuarioActividad;
    private Integer posicionGeneral;
    private Integer posicionCategoria;
    private Integer puntosGeneral;
    private Integer puntosCategoria;

    // Constructor
    public UsuarioCarrera(Integer idCarrerra, Integer idUsuarioActividad, Integer posicionGeneral, Integer posicionCategoria, Integer puntosGeneral, Integer puntosCategoria) {
        this.idCarrerra = idCarrerra;
        this.idUsuarioActividad = idUsuarioActividad;
        this.posicionGeneral = posicionGeneral;
        this.posicionCategoria = posicionCategoria;
        this.puntosGeneral = puntosGeneral;
        this.puntosCategoria = puntosCategoria;
    }

    // Constructor vacio
    public UsuarioCarrera() {
    }

    // Getter and Setter
    public Integer getIdCarrerra() {
        return idCarrerra;
    }

    public void setIdCarrerra(Integer idCarrerra) {
        this.idCarrerra = idCarrerra;
    }

    public Integer getIdUsuarioActividad() {
        return idUsuarioActividad;
    }

    public void setIdUsuarioActividad(Integer idUsuarioActividad) {
        this.idUsuarioActividad = idUsuarioActividad;
    }

    public Integer getPosicionGeneral() {
        return posicionGeneral;
    }

    public void setPosicionGeneral(Integer posicionGeneral) {
        this.posicionGeneral = posicionGeneral;
    }

    public Integer getPosicionCategoria() {
        return posicionCategoria;
    }

    public void setPosicionCategoria(Integer posicionCategoria) {
        this.posicionCategoria = posicionCategoria;
    }

    public Integer getPuntosGeneral() {
        return puntosGeneral;
    }

    public void setPuntosGeneral(Integer puntosGeneral) {
        this.puntosGeneral = puntosGeneral;
    }

    public Integer getPuntosCategoria() {
        return puntosCategoria;
    }

    public void setPuntosCategoria(Integer puntosCategoria) {
        this.puntosCategoria = puntosCategoria;
    }
}
