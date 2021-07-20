package com.company.Homework.TaskA;

import com.company.Lesson.dao.BaseDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CoachDaoImpl extends BaseDao implements CoachDao {
    @Override
    public List<Coach> getFromDB() {
        List<Coach> coaches = null;
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        try {
            connection = connect();
            statement = connection.prepareStatement("select * from coaches c\n" +
                                "join kind_of_sport kos on c.type_of_sport = kos.id");
            resultSet = statement.executeQuery();
            coaches = new ArrayList<>();

            while (resultSet.next()) {
                Coach coach = new Coach();
                coach.setId(resultSet.getInt("id"));
                coach.setFull_name(resultSet.getString("full_name"));
                coach.setSalary(resultSet.getInt("salary"));
                coaches.add(coach);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return coaches;
    }
}
