package com.t1.dao;

import com.t1.domain.Student;

import java.util.List;

public interface StudentDAO {

    public List<Student> queryBanHao(String banhao);
    public int CountPeople(String banhao);

}

