package com.company.Homework.TaskA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Moscow");
        hashMap.put(2, "Bishkek");
        hashMap.put(3, "Tashkent");
        hashMap.put(4, "Dushanbe");
        hashMap.put(5, "Astana");
        hashMap.put(6, "Minsk");
        hashMap.put(7, "Kiev");
        hashMap.put(8, "Baku");
        hashMap.put(9, "Tbilisi");
        hashMap.put(10, "Ankara");

        hashMap.entrySet()
                .stream()
                .filter(x -> x.getKey() > 5)
                .forEach(x -> System.out.println(x.getValue()));

        hashMap.entrySet()
                .stream()
                .filter(x -> x.getKey() % 3 == 0)
                .map(x -> x.getValue())
                .forEach(x -> {
                    if (x.length() == 7){
                        System.out.print(x);
                    }else {
                        System.out.print(x + ", ");
                    }
                });

        System.out.println(hashMap.entrySet()
                .stream()
                .filter(x -> x.getValue().length() > 5)
                .map(x -> x.getKey())
                .reduce((x, y) -> x * y)
                .get());
    }
}
