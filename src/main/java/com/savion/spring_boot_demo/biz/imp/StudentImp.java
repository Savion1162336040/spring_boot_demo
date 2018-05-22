package com.savion.spring_boot_demo.biz.imp;

import com.savion.spring_boot_demo.bean.Student;
import com.savion.spring_boot_demo.biz.StudentBiz;
import com.savion.spring_boot_demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("IStudentBiz")
public class StudentImp implements StudentBiz {

    private @Autowired
    StudentMapper studentMapper;

    @Override
    public Student getStudentById(int id) {
        return studentMapper.getStudentById(id);
    }

    @Override
    public Student[] getStudentByName(String name) {
        return studentMapper.getStudentsByName(name);
    }

    @Override
    public Student[] getStudentByAge(int age) {
        return studentMapper.getStudentsByAge(age);
    }

    @Override
    public Student[] getStudentByClasses(String classes) {
        return studentMapper.getStudentsByClass(classes);
    }

    @Override
    public boolean saveStudent(Student student) {
        return studentMapper.saveStudent(student) > 0 ? true : false;
    }
}
