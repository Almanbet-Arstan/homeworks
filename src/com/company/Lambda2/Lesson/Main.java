package com.company.Lambda2.Lesson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//                System.out.println("World");
//            }
//        }).start();
//
//        new Thread( () -> {
//            System.out.println("Hello");
//            System.out.println("World");
//        } ).start();
//
//        Calc divide = (a, b) -> {
//            if (b == 0){
//                return 0;
//            }
//            return a/b;
//        };
//        System.out.println(divide.operation(4, 2));
//        Calc sum = (a, b) -> (a + b);// Реализация функции
//        System.out.println(sum.operation(1, 1));// Вызов функции

//        Printable printable = (x) -> System.out.println("Lambda output: " + x);//Реализация функции print
//        String string = "Hello Java";
//        printable.print(string);//Вызов этой функции
//
//        Printable secondPrintable = (t) -> System.out.println(t);//Реализация функции print
//        secondPrintable.print("text");//Вызов этой функции

//        Operation sum = (x, y) -> x + y;
//        System.out.println(sum.executeOperation(1.7, 2.3));
//
//        Operation pow = (x, y) -> Math.pow(x, y);
//        System.out.println(pow.executeOperation(3.0, 2.0));
//
//        Operation multiply = (x, y) -> x * y;
//        System.out.println(multiply.executeOperation(2.0, 4.0));

//        double myDouble = 5.2;
//        Operation operation = (x, y) -> {
//            myDouble = 3.5;
//            return x * y;
//        };

//        DoubleChanger doubleChanger = (x, y) -> {
//            x.setDoubleValue(5.0);
//            return new DoubleClass(x.getDoubleValue() + y.getDoubleValue());
//        };
//        DoubleClass a = new DoubleClass(1.5);
//        DoubleClass b = new DoubleClass(2.0);
//        DoubleClass result = doubleChanger.execute(a,b);
//        System.out.println(result.getDoubleValue());
//        System.out.println(a.getDoubleValue());

//        GenericInterface<Integer> sumIntegers = (x,y) -> x+y;
//        System.out.println(sumIntegers.executeOperation(5,2));
//
//        GenericInterface<Double> sumDoubles = (x,y) -> x+y;
//        System.out.println(sumDoubles.executeOperation(1.3, 2.7));
//
//        GenericInterface<DoubleClass> sumDoubleClasses = (x,y) -> new DoubleClass(x.getDoubleValue() + y.getDoubleValue());
//        System.out.println(sumDoubleClasses.executeOperation(new DoubleClass(1.7), new DoubleClass(3.3)).getDoubleValue());


        List<String> stringList = new ArrayList<>();
        stringList.add("Ivan");
        stringList.add("Max");
        stringList.add("Andrew");

        StringAppender first = (list) -> {
            String result = "";
            for (String string:list) {
                result += string;
            }
            return result;
        };

        System.out.println(first.appendStrings(stringList));

        StringAppender second = (listStrings) -> {
            String result = "";
            for (String string:listStrings) {
                result += string + ",";
            }
            return result.substring(0, result.length() - 1);
        };
        System.out.println(second.appendStrings(stringList));
    }
}
