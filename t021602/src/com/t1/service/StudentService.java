package com.t1.service;


import com.t1.dao.impl.StudentDAOlmpl;
import com.t1.domain.Student;

import java.util.List;

public class StudentService {
    public double getAve(String banhao) {
        StudentDAOlmpl stulmpl = new StudentDAOlmpl();
        List<Student> list=stulmpl.queryBanHao(banhao);
        int count=list.size();
        System.out.println("size"+count);
       // int count = stulmpl.CountPeople(banhao);
        double sum = 0;
        double avg = 0;
        for (Student stu : list) {
            sum = sum + stu.getScore();
        }
        avg = sum / count;
        return avg;
    }
}
