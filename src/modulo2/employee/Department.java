package modulo2.employee;

/**
 * Created by pablomoreno on 21/05/15.
 */
public class Department {
    private String name;
    private Employee manager;
    private Location location;
    private Employee[] employeeList;

    public Department(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public Department() {
    }

    public Employee[] getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(Employee[] employeeList) {
        this.employeeList = employeeList;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Employee getManager() {

        return manager;
    }

    public void setManager(Employee manager) {

        this.manager = manager;
    }

    public Location getLocation() {

        return location;
    }

    public void setLocation(Location location) {

        this.location = location;

    }
}