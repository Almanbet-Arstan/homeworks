package com.company.Homework;


import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsersService {
    private UserDao userDao = new UserDao();

    public boolean register(UsersModels usersModels) throws Exception {
        if (usersModels.getLogin() == null || usersModels.getLogin().isEmpty()) {
            throw new IllegalArgumentException("Неверные параметры");
        }
        UsersModels userDb = userDao.getByUserName(usersModels.getLogin());
        if (userDb != null){
            throw new Exception("Такой у нас уже есть");
        }
        usersModels = userDao.createUser(usersModels);

        if (usersModels != null) {
            return true;
        }
        return false;
    }

    public boolean authorize(String login, String password) {
        boolean result = false;
        if (login == null || login.isEmpty()) {
            throw new IllegalArgumentException("Invalid login");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Invalid password");
        }
        UsersModels userDb = userDao.getByUserName(login);
        if (userDb != null) {
            UsersLogs userLog = new UsersLogs();
            userLog.setUserId(userDb.getId());

            result = userDb.getPassword().equals(password);
            userLog.setSuccess(result);
            userDao.writeLog(userLog);
            if (!userLog.getSuccess()){
                if (userDao.getCount(userDb) > 3){
                    userDao.blockUser(userDb);
                }
            }
            if (userLog.getSuccess()){
                if (userDao.getCount(userDb) == 2 || userDao.getCount(userDb) == 3){
                    userDao.deleteAllLogs(userDb);
                }
            }
            return result;
        }
        return false;
    }

    public void unblock(String login, String password) {
        if (login == null || login.isEmpty()) {
            throw new IllegalArgumentException("Invalid login");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Invalid password");
        }
        UsersModels user = userDao.getByUserName(login);
        if (user != null) {
            userDao.unblockUser(user);
        }
    }
}
