package modulo8.exceptions;

import modulo2.employee.Employee;

/**
 * Created by pablomoreno on 28/05/15.
 */
public class IllegalAgeException extends Exception {
    private int incorrectAge;
    private Employee employee;

    public IllegalAgeException(int incorrectAge, Employee employee){
        super("You have tried to assign a value of"+ "the wrong age");
        this.incorrectAge = incorrectAge;
        this.employee = employee;
    }

    public int getIncorrectAge() {
        return incorrectAge;
    }

    public void setIncorrectAge(int incorrectAge) {
        this.incorrectAge = incorrectAge;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
