package com.company.Lesson;

import java.sql.*;

public class UsersDao {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "a1l2m3a4";

    public Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public UserModel createUser(UserModel userModel) {
        ResultSet resultSet = null;
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("insert into users(login, email, password, date_of_registration)\n" +
                     "values (?, ?, ?, ?)")){
            userModel.setDateOfRegistration(new java.util.Date());
            statement.setString(1, userModel.getLogin());
            statement.setString(2, userModel.getEmail());
            statement.setString(3, userModel.getPassword());
            statement.setDate(4, new Date(userModel.getDateOfRegistration().getTime()));
            statement.executeUpdate();
            resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                userModel.setId(resultSet.getInt(1));
            }
            return userModel;
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

    public UserModel getByUserName(String userName){
        ResultSet resultSet = null;
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("select id, login, email, password, date_of_registration\n" +
                     "from users where login = ?")){
            statement.setString(1, userName);
            resultSet = statement.executeQuery();
            if (resultSet.next()){
                UserModel user = new UserModel();
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("login"));
                user.setLogin(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
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


    public void writeLog(UserLog userLog){
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("insert into user_logs (is_success, user_id)\n" +
                     "values (?, ?)")){
            statement.setBoolean(1, userLog.getSuccess());
            statement.setInt(2, userLog.getUserId());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
