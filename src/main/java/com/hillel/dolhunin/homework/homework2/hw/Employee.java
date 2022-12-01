package com.hillel.dolhunin.homework.homework2.hw;

public class Employee {

    private String name;
    private String surname;
    private String fatherName;
    private String email;
    private String function;
    private int phoneNumber;
    private int age;

    public Employee(String name, String surname, String fatherName, String email, String function, int phoneNumber, int age) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.email = email;
        this.function = function;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
