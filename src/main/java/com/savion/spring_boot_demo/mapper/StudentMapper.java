package com.savion.spring_boot_demo.mapper;

import com.savion.spring_boot_demo.bean.Student;

public interface StudentMapper {

    Student getStudentById(int id);

    Student[] getStudentsByName(String name);

    Student[] getStudentsByAge(int age);

    Student[] getStudentsByClass(String classes);

    int saveStudent(Student student);

}
