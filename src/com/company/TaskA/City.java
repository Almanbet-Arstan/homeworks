package com.company.TaskA;

public class City extends AbstractLocality{
    District[] districts;

    public City(String director, String name, int population, int square, District[] districts) {
        super(director, name, population, square);
        this.districts = districts;
    }

}
