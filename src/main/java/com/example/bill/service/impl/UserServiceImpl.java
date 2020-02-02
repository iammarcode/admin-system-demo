package com.example.bill.service.impl;

import com.example.bill.entities.User;
import com.example.bill.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    @Override
    public List<User> getUsers(User user) {
        return null;
    }

    @Override
    public User getUserById(Integer id) {
        return null;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int deleteUserById(Integer id) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }
}
