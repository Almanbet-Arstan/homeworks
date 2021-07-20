package com.company.Homework.TaskC.model;

public class City {
    private String name;
    private Integer country;
    private Integer mayor;
    private Integer population;

    public City(String name, Integer country, Integer mayor, Integer population) {
        this.name = name;
        this.country = country;
        this.mayor = mayor;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getMayor() {
        return mayor;
    }

    public void setMayor(Integer mayor) {
        this.mayor = mayor;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", country=" + country +
                ", mayor=" + mayor +
                ", population=" + population +
                '}';
    }
}
