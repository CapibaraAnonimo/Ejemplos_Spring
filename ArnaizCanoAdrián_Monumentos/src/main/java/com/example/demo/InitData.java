package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class InitData {
    //private MonumentsRepository repo;

    @PostConstruct
    public void Init() {
        Monument monumento1 = new Monument();
        monumento1.setCode("1");
        monumento1.setCountryName("España");
        monumento1.setCityName("Sevilla");
        monumento1.setName("Monumento1");
        monumento1.setDescription("Descripción");
        monumento1.setPhotoURL("qwert.es");
        monumento1.setLat(1234);
        monumento1.setLon(1234);


        //repo.save(monumento1);

        Monument monumento2 = new Monument();
        monumento2.setCode("2");
        monumento2.setCountryName("España");
        monumento2.setCityName("Sevilla");
        monumento2.setName("Monumento2");
        monumento2.setDescription("Descripción");
        monumento2.setPhotoURL("qwert.es");
        monumento2.setLat(1234);
        monumento2.setLon(1234);


        //repo.save(monumento2);
    }
}
