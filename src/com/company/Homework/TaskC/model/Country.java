package com.company.Homework.TaskC.model;

public class Country {
    private String name;
    private Integer code;
    private Integer population;
    private Integer president;


    public Country(String name, Integer code, Integer population, Integer president) {
        this.name = name;
        this.code = code;
        this.population = population;
        this.president = president;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getPresident() {
        return president;
    }

    public void setPresident(Integer president) {
        this.president = president;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", population=" + population +
                ", president=" + president +
                '}';
    }
}
