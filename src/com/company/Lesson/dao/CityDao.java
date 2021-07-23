package com.company.Lesson.dao;

import com.company.Lesson.Models.City;

import java.util.List;

public interface CityDao {
    boolean save(City city);
    List<City> getAll();
    List<City> getAllWithNameMoreFive();
}
