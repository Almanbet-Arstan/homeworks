package com.company.Lesson;

import com.company.Lesson.Models.City;
import com.company.Lesson.dao.CityDao;
import com.company.Lesson.dao.CityDaoImpl;

public class Main {
    public static void main(String[] args) {
        CityDao cityDao = new CityDaoImpl();
        for(int i = 0; i < 15; i++) {
            City city = new City();
            city.setName("Name " + i + 1);
            city.setFkMayorId(1);
            city.setFkCountryId(1);
            cityDao.save(city);
        }
        System.out.println(cityDao.getAll());
        System.out.println(cityDao.getAllWithNameMoreFive());
    }
}
