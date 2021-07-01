package com.company.Homework;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Dog> hashSet = new HashSet<>();
        int weight = 1;
        for (int i = 0; i < 40; i++) {
            hashSet.add(new Dog(randomIdentifier(), weight));
            weight++;
        }
        Iterator<Dog> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    // метод для вывода рандомных имен
    public static String randomIdentifier() {
        final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";

        final java.util.Random rand = new java.util.Random();

        final Set<String> identifiers = new HashSet<String>();

        StringBuilder builder = new StringBuilder();

        while(builder.toString().length() == 0) {
            int length = rand.nextInt(5)+5;
            for(int i = 0; i < length; i++) {
                builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
            }
            if(identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();
    }
}
