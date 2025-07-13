package com.examples.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.model.Country;

@Configuration
public class AppConfig {

    @Bean
    public Country country() {
        Country c = new Country();
        c.setName("India");
        c.setCapital("New Delhi");
        return c;
    }
}
