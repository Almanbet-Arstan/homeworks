package com.company.TaskA.model;

import java.util.Date;

public class Auto {
    private Integer id;
    private Integer numberOfAuto;
    private String model;
    private Date yearOfIssue;
    private String color;

    public Auto(Integer numberOfAuto, String model, Date yearOfIssue, String color) {
        this.numberOfAuto = numberOfAuto;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
    }

    public Auto(Integer numberOfAuto, String model, String color) {
        this.numberOfAuto = numberOfAuto;
        this.model = model;
        this.color = color;
    }

    public Auto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumberOfAuto() {
        return numberOfAuto;
    }

    public void setNumberOfAuto(Integer numberOfAuto) {
        this.numberOfAuto = numberOfAuto;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Date yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "numberOfAuto=" + numberOfAuto +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", color='" + color + '\'' +
                '}';
    }
}
