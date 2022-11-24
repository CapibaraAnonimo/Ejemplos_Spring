package com.example.tallerdtos.modelos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Matricula implements Serializable {
    @Id
    private String id;
    private String nombrePropietario;

    private String placa;
    private String marca;
    private String modelo;
}
