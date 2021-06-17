package com.company.Homework.TaskA;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> music = new ArrayList<>();
        music.add("Ветер с моря дул");
        music.add("Нагонял беду");
        music.add("И сказал ты мне");
        music.add("Больше не приду");
        ArrayList<String> musicCopy = new ArrayList<>();
        int index = music.size();
        for (int i = 0; i < music.size(); i++) {
            if (index > 0){
                music.add(i, music.get(i));
                index--;
                i++;
            }
        }
        for (int k = 0; k < music.size(); k++) {
            if (music.get(k).length() >= 15){
                musicCopy.add(music.get(k));
            }
        }
        musicCopy.remove("И сказал ты мне");
        musicCopy.remove("И сказал ты мне");
        System.out.println(music);
        System.out.println(musicCopy);
    }
}
