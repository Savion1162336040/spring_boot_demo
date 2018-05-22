package com.savion.spring_boot_demo.bean;

public class Student {

    int id;
    String name;
    int age;
    String classes;

    String sex;
    String nick;
    String pw;

    public Student(int id, String name, int age, String classes, String sex, String nick, String pw) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classes = classes;
        this.sex = sex;
        this.nick = nick;
        this.pw = pw;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public Student(String name, int id, int age, String classes) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classes='" + classes + '\'' +
                ", sex='" + sex + '\'' +
                ", nick='" + nick + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
