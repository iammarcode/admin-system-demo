package com.example.bill.service;

import com.example.bill.entities.User;

import java.util.List;

public interface UserService {
    User getUserByUsername(String username);

    List<User> getUsers(User user);

    User getUserById(Integer id);

    int addUser(User user);

    int deleteUserById(Integer id);

    int updateUser(User user);
}
