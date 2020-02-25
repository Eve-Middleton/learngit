package com.t1.dao;

import com.t1.domain.User;

import java.util.List;


public interface userDAO {

    public void insertUser(String name,String number,String password);

    public List<User> selectUser(String number, String password);

    public boolean delect(String number);
}
