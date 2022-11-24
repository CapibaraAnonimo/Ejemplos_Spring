package com.example.tallerdtos.controladores;


import com.example.tallerdtos.modelos.Auto;
import com.example.tallerdtos.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "ws/auto/")
@CrossOrigin("*")
public class AutoRestControlador {

    @Autowired
    private AutoService servicio;

    @GetMapping(value = "/")
    public List<Auto> getTodos() {
        return servicio.getTodos();
    }

    @GetMapping(value = "/{placa}")
    public Optional<Auto> getById(@PathVariable String placa) {
        return servicio.getValor(placa);
    }

    @PostMapping(value = "/guardar")
    public Auto guardar(@RequestBody Auto auto) {
        return servicio.guardar(auto);
    }

    @GetMapping(value = "/eliminar/{placa}")
    public Optional<Auto> eliminar(@PathVariable String placa) {
        Optional<Auto> auto = servicio.getValor(placa);
        servicio.eliminar(placa);
        return auto;
    }

}
