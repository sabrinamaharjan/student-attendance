package com.royalpublic.studentattendance.model;

public class Student {
    private Long id;
    private String name;
    private String address;
    private int rollno;

    public Student() {
    }

    public Student(Long id, String name, String address, int rollno) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.rollno = rollno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
