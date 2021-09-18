package com.company.Homework;

public class Main {
    public static void main(String[] args) {
        Team manchesterUnited = new Team("manchesterUnited", new Game());
        Team manchesterCity = new Team("manchesterCity", new Game());
        Statistics statistics = new Statistics(manchesterUnited, manchesterCity);

        manchesterUnited.setPriority(10);
        manchesterCity.setPriority(10);
        statistics.setPriority(1);

        manchesterUnited.start();
        manchesterCity.start();
        statistics.start();
    }
}
