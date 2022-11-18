package com.salesianostriana.dam.primerejemplo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class InitData {
    private final CountryRepository repo;

    @PostConstruct
    public void Init() {
        Country spain = new Country();
        spain.setCode("es");
        spain.setName("España");
    }
}
