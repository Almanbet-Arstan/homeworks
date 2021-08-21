package com.company.TaskA;

import com.company.TaskA.dao.AutoDao;
import com.company.TaskA.dao.AutoDaoImpl;
import com.company.TaskA.model.Auto;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
//        Auto auto1 = new Auto(6705, "Toyota Camry","Black");
//        Auto auto2 = new Auto(5712, "Honda Accord", "White");
        AutoDao autoDao = new AutoDaoImpl();
//        autoDao.createAuto(auto1);
//        autoDao.createAuto(auto2);
        Map<Integer, Auto> allAuto = new HashMap<>(autoDao.getAllCar());

        for (Map.Entry entry : allAuto.entrySet()) {
            System.out.println(entry);
        }
    }
}
