package modulo2.employee;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import modulo8.exceptions.IllegalAgeException;

import java.util.Date;

/**
 * @author pablomoreno
 */
public class Employee {
    private final int ID;
    //private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private Date hireDate;
    private Job job;
    private double salary;
    private Department department;
    private static int count = 0;

    static {
        count = 0;
        System.out.println("Bloque Static...");
    }

    public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job) {
        //System.out.println("Constructor");
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.job = job;
        this.hireDate = hireDate;
        this.ID = ++count;
    }


    public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job, Department department) {
        this(firstName, lastName, email, phoneNumber, hireDate, job);
    }

    public int getId() {

        return ID;
    }

/*    public void setId(int id) {

        this.id = id;
    }*/ //con final ya no hay set

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

    public void setAge(int age) throws IllegalAgeException {
        assert (age >= 18) : "Pegriño error";
        if (age >= 18 && age <= 65)
            this.age = age;
        else {
            throw new IllegalAgeException(age, this);
            //System.out.println("Edad incorrecta, debe ser entre 18 y 65 años");
        }
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

    protected void setSalary(double salary) {
        if (salary > this.job.getMaxSalary()) {
            this.salary = this.job.getMaxSalary();
        } else if (salary < this.job.getMinSalary()) {
            this.salary = this.job.getMinSalary();
        } else {
            this.salary = salary;
        }

    }


    public Job getJob() {

        return job;
    }

    public void setJob(Job job) {

        this.job = job;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {

        this.hireDate = hireDate;
    }

    public Department getDepartment() {

        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
        Employee[] employeeList = department.getEmployeeList();
        if (employeeList != null) {
            Employee[] aux = new Employee[employeeList.length + 1];
            System.arraycopy(employeeList, 0, aux, 0, employeeList.length);
            aux[aux.length - 1] = this;
            department.setEmployeeList(aux);
        } else {
            employeeList = new Employee[1];
            employeeList[0] = this;
            department.setEmployeeList(employeeList);
        }
    }

    @Override
    public String toString() {
        return "Full name: " + this.firstName + " "
                + this.lastName
                + ", Department: " + this.department.getName()
                + ", Salary: $" + this.salary
                + ", Phone Number: " + this.phoneNumber;
    }


}