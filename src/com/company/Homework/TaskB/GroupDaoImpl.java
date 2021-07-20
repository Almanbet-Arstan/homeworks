package com.company.Homework.TaskB;

import com.company.Lesson.dao.BaseDao;
import com.company.Lesson.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GroupDaoImpl extends BaseDao implements GroupDao {
    @Override
    public List<Group> getAll() {
        List<Group> groups = null;
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        try {
            connection = connect();
            statement = connection.prepareStatement("select * from student_group");
            resultSet = statement.executeQuery();
            groups = new ArrayList<>();

            while (resultSet.next()){
                Group group = new Group();
                group.setId(resultSet.getInt("id"));
                group.setName(resultSet.getString("name"));
                groups.add(group);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
        return groups;
    }
}
