package com.company.Homework.TaskC.dao.impl;

import com.company.Homework.TaskC.dao.PeopleDao;
import com.company.Homework.TaskC.model.People;
import com.company.Lesson.dao.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PeopleDaoImpl extends BaseDao implements PeopleDao {
    @Override
    public void insert(People people) {
        String insertPeople = String.format("insert into people (fio, date_of_birth) " +
                "values('%s', '%s');", people.getFio(), people.getDateOfBirth());
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(insertPeople)) {
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
