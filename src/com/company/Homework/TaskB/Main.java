package com.company.Homework.TaskB;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(random.nextInt(100) + 1);
        }
        arrayList.stream()
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.println(x));
        arrayList.stream()
                .filter(x -> x % 2 != 0)
                .map(x -> x + 10)
                .collect(Collectors.toList());
    }
}
