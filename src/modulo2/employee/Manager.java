package modulo2.employee;

import java.util.Date;

/**
 * Created by pablomoreno on 25/05/15.
 */
public class Manager extends Employee {
    private Employee secretary;
    private Director director;

    public Manager(Employee secretary, String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job) {
        super(firstName, lastName, email, phoneNumber, hireDate, job);
        this.secretary = secretary;
    }

    public Manager(Employee secretary, String firstName,String lastName, String email, String phoneNumber,Date hireDate, Job job, Department department) {
        this(secretary, firstName, lastName, email, phoneNumber, hireDate, job);
        super.setDepartment(department);
    }

    public Employee getSecretary() {

        return secretary;
    }

    public void setSecretary(Employee secretary) {

        this.secretary = secretary;
    }

    public Director getDirector() {

        return director;
    }

    public void setDirector(Director director) {

        this.director = director;
    }

    /*@Override
    public String getDetails() {

        return super.getDetails();
    }*/
    public String toString() {
        return super.toString()
                + ", Secretary: " + this.secretary.getLastName()
                + " " + this.secretary.getFirstName();
    }
}