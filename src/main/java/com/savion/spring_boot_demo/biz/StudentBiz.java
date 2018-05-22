package com.savion.spring_boot_demo.biz;

import com.savion.spring_boot_demo.bean.Student;

public interface StudentBiz {

    Student getStudentById(int id);

    Student[] getStudentByName(String name);

    Student[] getStudentByAge(int age);

    Student[] getStudentByClasses(String classes);

    boolean saveStudent(Student student);
}
