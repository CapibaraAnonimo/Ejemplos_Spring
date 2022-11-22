package com.example.tallerdtos.service;


import com.example.tallerdtos.modelos.Persona;
import com.example.tallerdtos.repositorios.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicio {

    @Autowired
    private PersonaRepositorio repositorio;

    public Persona guardar(Persona entity) {
        return repositorio.save(entity);
    }

    public void eliminar(String id) {
        repositorio.deleteById(id);
    }

    public Optional<Persona> getValor(String id) {
        return repositorio.findById(id);
    }

    public List<Persona> getTodos() {
        return (List<Persona>) repositorio.findAll();
    }
}
