package com.salesianostriana.dam.primerejemplo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository {

    Optional<Country> findFirstByCode(String code);
}
