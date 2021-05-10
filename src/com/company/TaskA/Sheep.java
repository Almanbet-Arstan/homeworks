package com.company.TaskA;

public class Sheep {
    private int weight;
    private int age;
    private String gender;
    private String nickname;

    public Sheep(int weight, int age, String gender, String nickname) {
        this.weight = weight;
        if (age > 0) this.age = age;
        else System.out.println("Error");
        this.gender = gender;
        this.nickname = nickname;
    }

    public Sheep() {
        weight = 60;
        age = 14;
        gender = "Female";
        nickname = "Dolli";
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "weight = " + weight +
                ", age = " + age +
                ", gender = '" + gender + '\'' +
                ", nickname = '" + nickname + '\'' +
                '}';
    }
}
