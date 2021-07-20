package com.company.Homework.TaskA;

public class Coach {
    private Integer id;
    private String full_name;
    private Integer salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Тренер: id = %d, %s, Зарплата: %s",
                id, full_name.length() > 3 ?  " Молодец" : "", salary);
    }
}
