package com.company.Lesson;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("Masha", "Pasha");
//        strings.stream().map(s -> s + s).forEach(s -> System.out.println(s));
//
//        List<Integer> integers = Arrays.asList(1, 2, 3, 10);
//        integers.stream().map(x -> x / 10.0).forEach(x -> System.out.println(x));
//
//        List<Student> students = Arrays.asList(
//                new Student(1L, "Pavel"),
//                new Student(2L, "Nurbek"),
//                new Student(3L, "Aidin")
//        );
//        students.stream()
//                .map(student -> student.getFullName())
//                .collect(Collectors.toList()).forEach(x -> System.out.println(x));

//        List<Integer> list = Stream.of(1,2,3).map(x -> x % 3 == 0 ? 0 : x * 10).collect(Collectors.toList());
//        list.stream().forEach(x -> System.out.println(x));

//        List<Integer> integers = Arrays.asList(16, 100, 12, 7);
//
//        integers = integers.stream().filter(x -> x > 15).map(x -> x / 2).collect(Collectors.toList());
//
//        integers.stream().forEach(x -> System.out.println(x));

        List<Student> students = Arrays.asList(
                new Student(1L, "Chyngyz"),
                new Student(4L, "Sasha"),
                new Student(2L, "Astan"),
                new Student(2L, "Aziret"),
                new Student(3L, "Mirlan"),
                new Student(5L, "Nurdin")
        );

//        Student student = students.stream()
//                .filter(x -> x.getId() % 2 == 0).max( (x, y) -> Long.compare(x.getId(), y.getId())).get();
//        System.out.println(student.getFullName());

        students.stream().filter(x -> x.getMark() >= 4).forEach(x -> System.out.println(x.getFullName()));

        System.out.println(students.stream().filter(x -> x.getMark() == 2d).count());
    }
}
