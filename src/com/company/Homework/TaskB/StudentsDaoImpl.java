package com.company.Homework.TaskB;

import com.company.Lesson.dao.BaseDao;

import java.sql.*;

public class StudentsDaoImpl extends BaseDao implements StudentsDao {

    public int countStudents() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            connection = connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select count(*) from students");

            if (resultSet.next()) {
                return resultSet.getInt(1);
            }

        }catch (SQLException e){
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

        return 0;
    }
}
