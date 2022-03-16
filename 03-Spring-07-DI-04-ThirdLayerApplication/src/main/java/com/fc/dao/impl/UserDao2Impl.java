package com.fc.dao.impl;

import com.fc.dao.UserDao;
import com.fc.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao2Impl implements UserDao {

    @Override
    public List<User> findAll() {
        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1,"鞠婧祎","12"));
        users.add(new User(2,"哈哈哈哈哈哈","21"));
        users.add(new User(3,"密码是啥","就不告诉你"));
        return users;
    }
}
