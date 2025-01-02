package com.web.controller;

import com.web.model.Usuario;
import com.web.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping(value = "/autenticar", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Usuario> autenticarUsuario(@RequestParam("correo") String correo,@RequestParam("password") String password){

        Usuario usuario = usuarioService.autenticarUsuario(correo, password);
        if(usuario != null){
            return ResponseEntity.ok(usuario);
        }else{
            return ResponseEntity.ok(usuario); // Devuelvo el usuario, porque sino el front me falla y me da el conflicto solamente
            //return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); // Mensaje correcto
        }
    }

    @PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> registrarUsuario(@RequestBody Usuario usuario){
        if(usuarioService.registrarUsuario(usuario)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
}
