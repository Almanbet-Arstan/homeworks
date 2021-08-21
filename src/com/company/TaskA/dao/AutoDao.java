package com.company.TaskA.dao;

import com.company.TaskA.model.Auto;

import java.util.Map;

public interface AutoDao {
    Map<Integer, Auto> getAllCar();
    Auto createAuto(Auto auto);
}
