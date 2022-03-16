package com.codegym.service;

import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUser();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    public List<User> searchByCountry(String country);

    public List<User> sortByName();

    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;

    public List<User> selectAllUserUseCallableStatement();

    public boolean updateUserUseCallableStatement(User user) throws SQLException;

    public boolean deleteUserUseCallableStatement(int id) throws SQLException;
}
