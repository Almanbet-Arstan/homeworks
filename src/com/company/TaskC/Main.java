package com.company.TaskC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<AbstractFruits> abstractFruits = new ArrayList<>();
        abstractFruits.add(new Apple("Гала"));
        abstractFruits.add(new Apple("Голден"));
        abstractFruits.add(new Apple("Антоновка"));

        abstractFruits.add(new Pear("Дюшес"));
        abstractFruits.add(new Pear("Лимонка"));
        abstractFruits.add(new Pear("Белолистка"));

        abstractFruits.add(new Apricot("Лучак", false));
        abstractFruits.add(new Apricot("Бодоми", true));
        abstractFruits.add(new Apricot("Хурмои", true));

        Map<Integer, AbstractFruits> hashMap = addFruits(abstractFruits);
        printMap(hashMap);

        removeAllApple(hashMap);
        printMap(hashMap);

        List<AbstractFruits> wormyApricots = sortWormyApricot(hashMap);
        printMap(hashMap);

        System.out.println("ArrayList: \n" + wormyApricots);

    }

    public static Map<Integer, AbstractFruits> addFruits(List<AbstractFruits> fruits) {
        Map<Integer, AbstractFruits> hashMap = new HashMap<>();

        for (AbstractFruits fruit:fruits) {
            hashMap.put(fruit.getId(), fruit);
        }
        return hashMap;
    }

    public static void removeAllApple(Map<Integer, AbstractFruits> hashMap) {
        hashMap.entrySet().removeIf(entry -> entry.getValue() instanceof Apple);
    }

    public static List<AbstractFruits> sortWormyApricot(Map<Integer, AbstractFruits> hashMap) {
        List<AbstractFruits> list = new ArrayList<>();
        for (Map.Entry<Integer, AbstractFruits> entry:hashMap.entrySet()) {
            if (entry.getValue() instanceof Apricot && ((Apricot) entry.getValue()).isWormy()){
                list.add(entry.getValue());
            }
        }
        hashMap.entrySet().removeIf(entry -> entry.getValue() instanceof Apricot && ((Apricot) entry.getValue()).isWormy());
        return list;
    }

    public static void printMap(Map<Integer, AbstractFruits> hashMap) {
        System.out.println("hashMap: ");
        for (Map.Entry<Integer, AbstractFruits> entry: hashMap.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println();
    }
}
