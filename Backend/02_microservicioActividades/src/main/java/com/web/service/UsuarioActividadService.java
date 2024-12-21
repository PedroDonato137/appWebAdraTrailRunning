package com.web.service;


import com.web.model.UsuarioActividad;
import com.web.model.UsuarioCarrera;

import java.util.List;

public interface UsuarioActividadService {
    List<UsuarioActividad> listarActividadesUsuario (Integer idUsuario); // Lista de actividadedes realizadas por el usuario
    UsuarioActividad guardarActividadUsuario (Integer idUsuario, Integer idActividad, String urlStrava);
    //UsuarioCarrera guardarCarrera (Integer idUsuarioActiviadad, Integer posicionGeneral, Integer posicionCategoria, Integer puntosGeneral, Integer puntosCategoria);
}
