package com.company.Lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(3);
//        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

//        System.out.println("Asc sorting");
//        arrayList.stream().sorted(Integer::compareTo).forEach(System.out::println);
//        System.out.println("Desc sorting");
//        arrayList.stream().sorted((x, y) -> Integer.compare(y, x)).forEach(System.out::println);


//        System.out.println("Removed duplicate");
//        arrayList.stream().distinct().forEach(x -> System.out.println(x));

//        System.out.println("Work with reduce");
//        int result = arrayList.stream().reduce(0, (x, y) -> x + y);
//        System.out.println("Sum: " + result);


//        long count = arrayList.stream().limit(2).count();
//        int max = arrayList.stream().max((x, y) -> Integer.compare(x, y)).get();
//        int min = arrayList.stream().min((x, y) -> Integer.compare(x, y)).get();
//        System.out.println("Max " + max);
//        System.out.println("Min " + min);
//        System.out.println("Count " + count);



//        List<String> arrayList = new ArrayList<>();
//        arrayList.add("A");
//        arrayList.add("B");
//        arrayList.add("C");
//        arrayList.add("D");
//        arrayList.add("E");
//
//        String lastValue = arrayList.get(arrayList.size() - 1);
//
//        arrayList.forEach(x -> {
//            if (!x.equals(lastValue)){
//                x += ", ";
//            }
//            System.out.println(x);
//        });

//        Integer integerOptional = Optional.ofNullable(getInt()).orElse(4);
//        System.out.println(integerOptional);

        System.out.println(arrayList.stream().allMatch(x -> x > 0));
        System.out.println(arrayList.stream().anyMatch(x -> x >= 5));
        System.out.println(arrayList.stream().noneMatch(x -> x > 5));


    }

    static Integer getInt(){
        return null;
    }
}
