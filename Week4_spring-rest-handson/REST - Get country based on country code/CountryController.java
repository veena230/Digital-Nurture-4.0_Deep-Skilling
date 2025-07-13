package com.example.country;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CountryController {

    private static final Map<String, String> countryMap = new HashMap<>();

    static {
        countryMap.put("IN", "India");
        countryMap.put("US", "United States");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("FR", "France");
        countryMap.put("DE", "Germany");
        countryMap.put("JP", "Japan");
        // Add more country codes as needed
    }

    @GetMapping("/country/{code}")
    public String getCountryByCode(@PathVariable String code) {
        String country = countryMap.get(code.toUpperCase());
        if (country != null) {
            return country;
        } else {
            return "Country code not found!";
        }
    }
}
