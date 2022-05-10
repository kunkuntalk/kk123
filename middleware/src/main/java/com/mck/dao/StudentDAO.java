package com.mck.dao;


import com.mck.bean.Student;

import java.util.List;

public interface StudentDAO{
    public void insert(Student s);
    public void update(Student s);
    public void delete(int iD);
    public Student findByID(int iD);
    public List<Student> findAll();
} 

