package com.t1.service;

import com.t1.dao.impl.UserDAOlmpl;
import com.t1.domain.User;

import java.util.List;

public class UserService {
    public boolean getSelect(String number, String password){
        boolean result=false;
        UserDAOlmpl suser=new UserDAOlmpl();
        List<User> alist= suser.selectUser(number, password);
        System.out.println("……");
        System.out.println(alist.get(0).getNumber());
        if(alist.get(0).getNumber()!=null){
            result=true;
        }
        return result;

    }

}
