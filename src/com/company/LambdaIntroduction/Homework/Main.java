package com.company.LambdaIntroduction.Homework;

import com.company.LambdaIntroduction.Homework.A.Juice;
import com.company.LambdaIntroduction.Homework.A.LiquidAbstract;
import com.company.LambdaIntroduction.Homework.B.Student;
import com.company.LambdaIntroduction.Homework.B.Testable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //A
        List<Juice> juices = new ArrayList<>();
        juices.add(new Juice("Apple juice"));
        juices.add(new Juice("Orange juice"));
        LiquidAbstract liquidAbstract = new LiquidAbstract("Water") {
            @Override
            public void pour(List<? extends LiquidAbstract> liquids) {
                super.pour(liquids);
            }
        };
        liquidAbstract.pour(juices);

        //B
        Student student1 = new Student("Ivan");
        Testable student2 = () -> System.out.println("Petr passing test.");
        Testable student3 = () -> System.out.println("Sergey passing test.");
        student1.passTest();
        student2.passTest();
        student3.passTest();
    }
}
