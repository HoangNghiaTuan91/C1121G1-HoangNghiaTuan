package com.codegym.service.impl;

import com.codegym.model.User;
import com.codegym.repository.UserRepository;
import com.codegym.repository.impl.UserRepositoryImpl;
import com.codegym.service.UserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public void insertUser(User user) throws SQLException {
        userRepository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return userRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUser() {
        return userRepository.selectAllUser();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return userRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return userRepository.updateUser(user);
    }

    @Override
    public List<User> searchByCountry(String country) {
        return userRepository.searchByCountry(country);
    }

    @Override
    public List<User> sortByName() {
        return userRepository.sortByName();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public void insertUserStore(User user) throws SQLException {
        userRepository.insertUserStore(user);
    }

    @Override
    public List<User> selectAllUserUseCallableStatement() {
        return userRepository.selectAllUserUseCallableStatement();
    }

    @Override
    public boolean updateUserUseCallableStatement(User user) throws SQLException {
        return userRepository.updateUserUseCallableStatement(user);
    }

    @Override
    public boolean deleteUserUseCallableStatement(int id) throws SQLException {
        return userRepository.deleteUserUseCallableStatement(id);
    }

    @Override
    public void addUserTransaction(User user, int[] permission) {

    }
}
