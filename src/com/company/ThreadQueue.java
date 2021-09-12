package com.company;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ThreadQueue extends Thread{
    private List<String> strings = new ArrayList<>();
    public ThreadQueue(List<String> strings){
        this.strings = strings;
    }

    @Override
    public void run() {
        for (String string:strings) {
            try {
                sleep(5000);
                System.out.println("[" + getName() + "] : " + string + " " + LocalTime.now());
            }catch (InterruptedException e){
                System.out.println(getName() + " : ошибка");
            }
        }
    }
}
