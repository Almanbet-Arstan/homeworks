package com.company.Homework.TaskC.dao.impl;

import com.company.Homework.TaskC.dao.CountryDao;
import com.company.Homework.TaskC.model.Country;
import com.company.Lesson.dao.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CountryDaoImpl extends BaseDao implements CountryDao {
    @Override
    public void insert(Country country) {
        String insertCountry = String.format("insert into country (name, code, population, president) " +
                "values('%s', %d, %d, %d);", country.getName(), country.getCode(), country.getPopulation(), country.getPresident());
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(insertCountry)) {
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void selectCity() {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("select c2.\"name\" from country c \n" +
                                                                            "join city c2 on c.id = c2.country_id \n" +
                                                                            "where c.\"name\" like 'K%'");
             ResultSet resultSet = statement.executeQuery();) {

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getAllPeopleCount() {
        int countAllCityPeople = 0;
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("select c2.population from country c \n" +
                     "join city c2 on c.id = c2.country_id");
             ResultSet resultSet = statement.executeQuery();) {

            while (resultSet.next()) {
                countAllCityPeople += resultSet.getInt("population");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return countAllCityPeople;
    }

    @Override
    public void addLanguageColumn() {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("ALTER TABLE public.country " +
                     "ADD COLUMN language VARCHAR");) {
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
