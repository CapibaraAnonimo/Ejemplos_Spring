package com.example.demo;

import lombok.Data;
import lombok.Generated;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@RequiredArgsConstructor
public class Monument {
    @Generated
    @Id
    private int id;

    private String code, countryName, cityName, name, description, photoURL;

    private int lat, lon;
}
