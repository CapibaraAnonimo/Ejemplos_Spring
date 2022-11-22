package com.example.tallerdtos.service;

import com.example.tallerdtos.modelos.Auto;
import com.example.tallerdtos.repositorios.AutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoService {
    @Autowired
    private AutoRepositorio repositorio;

    public Auto guardar(Auto entity) {
        return repositorio.save(entity);
    }

    public void eliminar(String id) {
        repositorio.deleteById(id);
    }

    public Optional<Auto> getValor(String id) {
        return repositorio.findById(id);
    }

    public List<Auto> getTodos() {
        return (List<Auto>) repositorio.findAll();
    }
}
