package com.company.Lesson.Models;

public class City {
    private Integer id;
    private String name;
    private Integer fkCountryId;
    private Integer fkMayorId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFkCountryId() {
        return fkCountryId;
    }

    public void setFkCountryId(Integer fkCountryId) {
        this.fkCountryId = fkCountryId;
    }

    public Integer getFkMayorId() {
        return fkMayorId;
    }

    public void setFkMayorId(Integer fkMayorId) {
        this.fkMayorId = fkMayorId;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fkCountryId=" + fkCountryId +
                ", fkMayorId=" + fkMayorId +
                '}';
    }
}
