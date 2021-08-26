package com.company.Lesson;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(50, 1, false);
        linkedHashMap.put("1", "first");
        linkedHashMap.put("2", "second");
        linkedHashMap.put("3", "third");

        linkedHashMap.get("1");
        linkedHashMap.get("3");
        for (Map.Entry<String, String> entry:linkedHashMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
