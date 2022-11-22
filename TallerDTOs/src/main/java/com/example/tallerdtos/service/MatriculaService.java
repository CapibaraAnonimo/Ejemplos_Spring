package com.example.tallerdtos.service;

import com.example.tallerdtos.modelos.Matricula;
import com.example.tallerdtos.modelos.MatriculaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaService {
    @Autowired
    private MatriculaMapper mapper;

    @Autowired
    private AutoService autoService;

    @Autowired
    private PersonaServicio personaServicio;

    public int guardar(Matricula matricula) {
        autoService.guardar(mapper.toAuto(matricula));
        personaServicio.guardar(mapper.toPersona(matricula));
        return 1;
    }
}
