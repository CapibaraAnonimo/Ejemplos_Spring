package com.example.tallerdtos.modelos;

import org.springframework.stereotype.Component;

@Component
public class MatriculaMapper {
    public Auto toAuto(Matricula in) {
        Auto auto = new Auto();
        auto.setPlaca(in.getPlaca());
        auto.setMarca(in.getMarca());
        auto.setModelo(in.getModelo());
        auto.setPropietario(in.getId());
        return auto;
        /*return Auto.builder()
                .placa(in.getPlaca())
                .marca(in.getMarca())
                .modelo(in.getModelo())
                .propietario(in.getId())
                .build;*/
    }

    public Persona toPersona(Matricula in) {
        Persona persona = new Persona();
        persona.setId(in.getId());
        persona.setNombre(in.getNombrePropietario());
        return persona;
        /*return Persona.builder()
                .id(in.getId())
                .nombre(in.getNombre())
                .build;*/
    }
}
