package com.company.Homework.TaskC.model;

public class People {
    private String fio;
    private String dateOfBirth;

    public People(String fio, String dateOfBirth) {
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "People{" +
                "fio='" + fio + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
