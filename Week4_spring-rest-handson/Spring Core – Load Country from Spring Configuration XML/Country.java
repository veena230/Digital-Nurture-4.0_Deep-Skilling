package com.example.model;

public class Country {
    private String name;
    private String capital;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    // ✅ Add this method
    public void display() {
        System.out.println("Country: " + name);
        System.out.println("Capital: " + capital);
    }
}
