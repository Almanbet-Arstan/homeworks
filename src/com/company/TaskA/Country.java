package com.company.TaskA;

public class Country extends AbstractLocality{
    City[] cities;
    Village[] villages;

    public Country(String director, String name, int population, int square, City[] cities, Village[] villages) {
        super(director, name, population, square);
        this.cities = cities;
        this.villages = villages;
    }
}
