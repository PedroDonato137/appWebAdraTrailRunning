package com.web.service;

import com.web.model.UsuarioActividad;

import java.util.List;

public interface UsuarioActividadService {
    List<UsuarioActividad> listarActividadesUsuario (Integer idUsuario); // Lista de actividadedes realizadas por el usuario
    UsuarioActividad guardarActividadUsuario (Integer idUsuario, Integer idActividad, String urlStrava);
}
