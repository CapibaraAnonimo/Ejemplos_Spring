package com.example.tallerdtos.controladores;

import com.example.tallerdtos.modelos.Matricula;
import com.example.tallerdtos.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/matricula/")
@CrossOrigin("*")
public class MatriculaRestController {
    @Autowired
    private MatriculaService servicio;

    @PostMapping(value = "/guardar")
    public int guardar(@RequestBody Matricula matricula) {
        return servicio.guardar(matricula);
    }

}

