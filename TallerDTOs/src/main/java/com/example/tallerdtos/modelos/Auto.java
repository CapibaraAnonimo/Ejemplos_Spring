package com.example.tallerdtos.modelos;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Auto {
    @Id
    private String placa;
    private String marca;
    private String modelo;
    private String propietario;
}
