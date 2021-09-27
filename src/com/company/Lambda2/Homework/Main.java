package com.company.Lambda2.Homework;

public class Main {
    public static void main(String[] args) {
        Factorial factorial = (a) -> {
            int result = 1;
            while (a > 0){
                result *= a;
                a--;
            }
            return result;
        };
        System.out.println(factorial.operation(6));


        RootDegree rootDegreeLambda = (a, b) -> Math.pow(b, (1 / a));
        System.out.println(rootDegreeLambda.calculate(4, 81));
    }
}
