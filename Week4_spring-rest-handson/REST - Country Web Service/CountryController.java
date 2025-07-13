package com.example.springresthandson.controller;

import com.example.springresthandson.model.Country;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Value("${app.message}")
    private String message;

    @GetMapping("/country")
    public Country getCountry() {
        return new Country("India", "New Delhi");
    }

    @GetMapping("/countries")
    public List<Country> getCountries() {
        return List.of(
                new Country("India", "New Delhi"),
                new Country("USA", "Washington, D.C."),
                new Country("France", "Paris")
        );
    }

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}
