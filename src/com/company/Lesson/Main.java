package com.company.Lesson;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }

        Set<Integer> a = numbers.subSet(5, 700);
        Set<Integer> b = numbers.headSet(30);
        Set<Integer> c = numbers.tailSet(980);

        int sumA = a.stream().mapToInt(Integer::intValue).sum();
        int sumB = b.stream().mapToInt(Integer::intValue).sum();
        int sumC = c.stream().mapToInt(Integer::intValue).sum();
        int sumTotal = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("sumA = " + sumA);
        System.out.println("sumB = " + sumB);
        System.out.println("sumC = " + sumC);
        System.out.println("sumTotal = " + sumTotal);

        System.out.println(100.0 / sumTotal * (sumA + sumB + sumC));
    }
}
