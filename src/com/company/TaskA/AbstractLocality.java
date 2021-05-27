package com.company.TaskA;

public abstract class AbstractLocality {
    private String director;
    private String name;
    private int population;
    private int square;

    public AbstractLocality(String director, String name, int population, int square) {
        this.director = director;
        this.name = name;
        this.population = population;
        this.square = square;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

}
