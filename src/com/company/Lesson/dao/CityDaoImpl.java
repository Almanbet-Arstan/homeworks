package com.company.Lesson.dao;

import com.company.Lesson.Models.City;
import com.company.Lesson.Models.Country;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityDaoImpl implements CityDao{
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "";

    private final String SAVE_CItY =
            "insert into city(name, fk_country_id, fk_mayor_id)\n" +
                    "values(?, ?, ?)";

    private final String GET_ALL_CITIES =
            "select id, name, fk_country_id, fk_mayor_id from city";

    private final String GET_CITIES_WITH_LEN_5 =
            "select id, name, fk_country_id, fk_mayor_id \n" +
                    "from city where CHAR_LENGTH(name) > 5";

    private Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }


    @Override
    public boolean save(City city) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = connect();
            preparedStatement = connection.prepareStatement(SAVE_CItY);
            preparedStatement.setString(1, city.getName());
            preparedStatement.setInt(2, city.getFkCountryId());
            preparedStatement.setInt(3, city.getFkMayorId());
            int changedRows = preparedStatement.executeUpdate();
            return changedRows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public List<City> getAll() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<City> cities = new ArrayList<>();
        try {
            connection = connect();
            preparedStatement = connection.prepareStatement(GET_ALL_CITIES);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                City city = new City();
                city.setId(resultSet.getInt("id"));
                city.setName(resultSet.getString("name"));
                city.setFkCountryId(resultSet.getInt("fk_country_id"));
                city.setFkMayorId(resultSet.getInt("fk_mayor_id"));
                cities.add(city);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (preparedStatement != null)
                    preparedStatement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (preparedStatement != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return cities;
    }

    @Override
    public List<City> getAllWithNameMoreFive() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<City> cities = new ArrayList<>();
        try {
            connection = connect();
            preparedStatement = connection.prepareStatement(GET_CITIES_WITH_LEN_5);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                City city = new City();
                city.setId(resultSet.getInt("id"));
                city.setName(resultSet.getString("name"));
                city.setFkCountryId(resultSet.getInt("fk_country_id"));
                city.setFkMayorId(resultSet.getInt("fk_mayor_id"));
                cities.add(city);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (preparedStatement != null)
                    preparedStatement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (preparedStatement != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return cities;
    }


}
