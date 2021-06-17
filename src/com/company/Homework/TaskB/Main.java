package com.company.Homework.TaskB;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(i, random.nextInt(100) + 1);
        }
        for (int k = 0; k < numbers.size(); k++) {
            if (numbers.get(k) % 2 == 0){
                evenNumbers.add(numbers.get(k));
            }else {
                oddNumbers.add(numbers.get(k));
            }
        }
        System.out.println(numbers);
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }
}
