package com.example.tallerdtos.controladores;

import java.util.List;
import java.util.Optional;

import com.example.tallerdtos.modelos.Persona;
import com.example.tallerdtos.service.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "ws/persona/")
@CrossOrigin("*")
public class PersonaRestControlador {

    @Autowired
    private PersonaServicio servicio;

    @GetMapping(value = "/")
    public List<Persona> getTodos() {
        return servicio.getTodos();
    }

    @GetMapping(value = "/{id}")
    public Optional<Persona> getById(@PathVariable String id) {
        return servicio.getValor(id);
    }

    @PostMapping(value = "/guardar")
    public Persona guardar(@RequestBody Persona persona) {
        return servicio.guardar(persona);
    }

    @GetMapping(value = "/eliminar/{id}")
    public Optional<Persona> eliminar(@PathVariable String id) {
        Optional<Persona> retorno = servicio.getValor(id);
        servicio.eliminar(id);
        return retorno;
    }

}
