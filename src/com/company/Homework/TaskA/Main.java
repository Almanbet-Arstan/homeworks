package com.company.Homework.TaskA;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CoachDao coachDao = new CoachDaoImpl();
        List<Coach> coaches = coachDao.getFromDB();
        int sum = 0;
        for (Coach coach:coaches) {
            System.out.println(coach);
            sum += coach.getSalary();
        }
        System.out.println("Итоговая заработная плата по всем тренерам равна " + sum);
    }
}
