package com.company.TaskA.dao;

import com.company.TaskA.model.Auto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class AutoDaoImpl extends BaseDao implements AutoDao{
    @Override
    public Map<Integer, Auto> getAllCar() {
        String sql = "select * from auto";
        Map<Integer, Auto> hashMap = new HashMap<>();
        try(ResultSet resultSet = connect().prepareStatement(sql).executeQuery()) {
            while (resultSet.next()){
                Auto auto = new Auto(
                        resultSet.getInt("number_of_auto"),
                        resultSet.getString("model"),
                        resultSet.getDate("year_of_issue"),
                        resultSet.getString("color"));
                hashMap.put(resultSet.getInt("id_auto"), auto);
            }
            return hashMap;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public Auto createAuto(Auto auto) {
        String sql = "insert into auto (number_of_auto, model, color, year_of_issue)\n" +
                "values (?, ?, ?, now())";
        ResultSet resultSet = null;
        try(PreparedStatement preparedStatement = connect().prepareStatement(sql)) {
            preparedStatement.setInt(1, auto.getNumberOfAuto());
            preparedStatement.setString(2, auto.getModel());
            preparedStatement.setString(3, auto.getColor());
            preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()){
                auto.setId(resultSet.getInt(1));
            }
            return auto;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }
}
