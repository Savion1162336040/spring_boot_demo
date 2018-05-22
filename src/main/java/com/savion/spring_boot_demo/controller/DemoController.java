package com.savion.spring_boot_demo.controller;

import com.savion.spring_boot_demo.bean.DBUser;
import com.savion.spring_boot_demo.bean.Student;
import com.savion.spring_boot_demo.bean.User;
import com.savion.spring_boot_demo.biz.StudentBiz;
import com.savion.spring_boot_demo.biz.UserBIZ;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {

    @Autowired
    User user;

    @Autowired
    UserBIZ userBIZ;
    @Autowired
    StudentBiz studentBiz;

    Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String requestName(@PathVariable("name") String name) {
        logger.info("requestName for name");
        logger.info("requestName from:" + user.getName());
        return String.format("name = %s", user.getName());
    }

    @RequestMapping(value = "/map/{key}={value}", method = RequestMethod.GET)
    public String requestName(@PathVariable("key") String key, @PathVariable("value") String value) {
        logger.info("requestName for keymap");
        return String.format("%s = %s", key, value);
    }

    @RequestMapping(value = "/port", method = RequestMethod.GET)
    public String requestPort() {
        return user.getPort();
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String requestName() {
        return user.getName();
    }

    @RequestMapping(value = "/path", method = RequestMethod.GET)
    public String requestPath() {
        return user.getContextPath();
    }

    @RequestMapping(value = "/address", method = RequestMethod.GET)
    public String requestAddress() {
        return user.getAddrss();
    }

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public String requestVersion() {
        Package pa = SpringBootVersion.class.getPackage();
        return SpringBootVersion.getVersion();
    }

    @RequestMapping(value = "/userbyid", method = RequestMethod.GET)
    public String getUserByid(int id) {
        logger.info(String.format("getUserByid：id=%s", id));
        DBUser user = userBIZ.getUser(id);
        return user.toString();
    }

    @RequestMapping(value = "/saveuser", method = RequestMethod.GET)
    public boolean saveUser(int id, String name, int age) {
        logger.info(String.format("saveUser：id=%s,name=%s,age=%s", id, name, age));
        DBUser user = new DBUser();
        user.setAge(age);
        user.setName(name);
        user.setId(id);
        return userBIZ.saveUser(user);
    }

    @RequestMapping(value = "/studentid", method = RequestMethod.GET)
    public String getStudentById(int id) {
        logger.info(String.format("getStudentById:%s", id));
        return studentBiz.getStudentById(id).toString();
    }

    @RequestMapping(value = "/studentname", method = RequestMethod.GET)
    public String getStudentByName(String name) {
        logger.info(String.format("getStudentByName:%s", name));
        String result = null;
        for (Student student : studentBiz.getStudentByName(name)) {
            result += student.toString();
        }
        return result;
    }

    @RequestMapping(value = "/studentage", method = RequestMethod.GET)
    public String getStudentByAge(int age) {
        logger.info(String.format("getStudentByAge:%s", age));
        String result = null;
        for (Student student : studentBiz.getStudentByAge(age)) {
            result += student.toString();
        }
        return result;
    }

    @RequestMapping(value = "/studentclasses", method = RequestMethod.GET)
    public String getStudentByClasses(String classes) {
        logger.info(String.format("getStudentByClasses:%s", classes));
        String result = null;
        for (Student student : studentBiz.getStudentByClasses(classes)) {
            result += student.toString();
        }
        return result;
    }

    @RequestMapping(value = "/savestudent", method = RequestMethod.GET)
    public boolean saveStudent(int id, String name, String classes, int age,String pw,String nick,String sex ) {
        logger.info(String.format("saveStudent:%s,%s,%s,%s", id, name, age, classes));
        return studentBiz.saveStudent(new Student(id,name, age, classes,sex,nick,pw));
    }

}
