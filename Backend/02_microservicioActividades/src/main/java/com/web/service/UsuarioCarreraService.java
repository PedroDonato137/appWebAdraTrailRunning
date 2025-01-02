package com.web.service;

import com.web.model.UsuarioCarrera;

public interface UsuarioCarreraService {
    UsuarioCarrera guardarCarrera (Integer idUsuarioActividad, Integer posicionGeneral, Integer posicionCategoria, Integer puntosGeneral, Integer puntosCategoria);
}
