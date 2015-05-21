package modulo2.employee;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;

/**
 *
 * @author pablomoreno
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private double salary;
    private String job;
    private Date hireDate;
    private String department;


    public Employee(String fn, String e, String ln, String pn, Date hd, String j, String d) {
        this.firstName = fn;
        this.email = e;
        this.phoneNumber = pn;
        this.job = j;
        this.hireDate = hd;
        this.department = d;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=18 && age<=65)
            this.age = age;
        else
            System.out.println("Edad incorrecta, debe ser entre 18 y 65 años");
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}