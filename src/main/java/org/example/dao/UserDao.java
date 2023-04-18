package org.example.dao;

import org.example.model.User;

import java.util.List;

public interface UserDao {
    public void createUser();
    public void saveUser();
    List<User> getAllUsers();
    public void deleteUser();
    public void updateUser();
}
