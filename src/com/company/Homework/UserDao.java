package com.company.Homework;

import java.sql.*;

public class UserDao {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "a1l2m3a4";

    public Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public UsersModels createUser(UsersModels users) {
        ResultSet resultSet = null;
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("insert into users_models(login, email, password, is_blocked, date_of_registration)\n" +
                     "values (?, ?, ?, ?, ?)")){
            users.setDateOfRegistration(new java.util.Date());
            statement.setString(1, users.getLogin());
            statement.setString(2, users.getEmail());
            statement.setString(3, users.getPassword());
            statement.setBoolean(4, users.getBlocked());
            statement.setDate(5, new Date(users.getDateOfRegistration().getTime()));
            statement.executeUpdate();
            resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                users.setId(resultSet.getInt(1));
            }
            return users;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    public UsersModels getByUserName(String userModelName){
        ResultSet resultSet = null;
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("select id, login, email, password, is_blocked, date_of_registration\n" +
                     "from users_models where login = ?")){
            statement.setString(1, userModelName);
            resultSet = statement.executeQuery();
            if (resultSet.next()){
                UsersModels user = new UsersModels();
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("login"));
                user.setLogin(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setBlocked(resultSet.getBoolean("is_blocked"));
                user.setDateOfRegistration(resultSet.getDate("date_of_registration"));
                return user;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    public void writeLog(UsersLogs usersLogs){
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("insert into users_logs (is_success, users_model_id)\n" +
                     "values (?, ?)")){
            statement.setBoolean(1, usersLogs.getSuccess());
            statement.setInt(2, usersLogs.getUserId());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void blockUser(UsersModels usersModels){
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("update users_models\n" +
                     "set is_blocked = true\n" +
                     "where id = ?\n")){
            statement.setInt(1, usersModels.getId());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Integer getCount(UsersModels usersModels) {
        ResultSet resultSet = null;
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("select count(*) from users_logs ul\n" +
                     "where ul.users_model_id = ? and ul.is_success = false")){
            statement.setInt(1, usersModels.getId());
            resultSet = statement.executeQuery();
            if (resultSet.next()){
                int count = resultSet.getInt("count");
                return count;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return 0;
    }

    public void deleteAllLogs(UsersModels usersModels) {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("delete from users_logs\n" +
                     "where users_model_id = ?")){
            statement.setInt(1, usersModels.getId());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void unblockUser (UsersModels usersModels) {
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("update users_models \n" +
                     "set is_blocked = false\n" +
                     "where id = ?")){
            statement.setInt(1, usersModels.getId());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
