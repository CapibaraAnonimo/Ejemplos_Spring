package com.salesianostriana.dam.primerejemplo;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Country {
    private String code, name, currency, capital;
    private int population;
}
