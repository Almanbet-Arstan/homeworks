package com.company.TaskA;

public class Horse {
    private int weight;
    private int age;
    private String color;
    private String gender;
    private String nickname;

    public Horse(int weight, int age, String color, String gender, String nickname) {
        this.weight = weight;
        if (age > 0) this.age = age;
        else System.out.println("Error");
        this.color = color;
        this.gender = gender;
        this.nickname = nickname;
    }

    public Horse() {
        weight = 150;
        age = 27;
        color = "White";
        gender = "Female";
        nickname = "Ashly";
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight = " + weight +
                ", age = " + age +
                ", color = '" + color + '\'' +
                ", gender = '" + gender + '\'' +
                ", nickname = '" + nickname + '\'' +
                '}';
    }
}
