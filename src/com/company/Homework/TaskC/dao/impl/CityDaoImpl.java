package com.company.Homework.TaskC.dao.impl;

import com.company.Homework.TaskC.dao.CityDao;
import com.company.Homework.TaskC.model.City;
import com.company.Lesson.dao.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CityDaoImpl extends BaseDao implements CityDao {
    @Override
    public void insert(City city) {
        String insertCity = String.format("insert into city (name, country_id, population, mayor) " +
                "values('%s', %d, %d, %d);", city.getName(), city.getCountry(), city.getPopulation(), city.getMayor());
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(insertCity)) {
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
