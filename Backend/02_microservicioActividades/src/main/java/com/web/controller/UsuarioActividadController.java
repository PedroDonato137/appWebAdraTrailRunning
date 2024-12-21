package com.web.controller;


import com.web.model.Actividad;
import com.web.model.UsuarioActividad;
import com.web.service.UsuarioActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UsuarioActividadController {

    @Autowired
    UsuarioActividadService usuarioActividadService;

    @GetMapping(value = "/listado", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UsuarioActividad>> listarActividadesUsuario (@RequestParam("idUsuario") Integer idUsuario){
        return new ResponseEntity<>(usuarioActividadService.listarActividadesUsuario(idUsuario), HttpStatus.OK);
    }
}
