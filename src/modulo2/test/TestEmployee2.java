/*
package modulo2.test;

import com.sun.tools.doclets.internal.toolkit.util.SourceToHTMLConverter;
import modulo2.employee.Country;
import modulo2.employee.Department;
import modulo2.employee.Employee;
import modulo2.employee.Job;
import modulo2.employee.Location;
import modulo2.employee.Manager;
import modulo2.employee.taxs.TaxService;
import modulo2.employee.Director;


import java.util.Date;

*/
/*
 *
 * @author pablomoreno
 *//*

public class TestEmployee2 {
    public static void main(String[] args) {
        //Employee employee = Employee("","","","", new Date(), new Job(), new Department());
    */
/*
        Employee e1 = new Employee();
        Employee e3 = new Employee();
        Employee e7 = new Employee();

        e1.setAge(25);
        e3.setAge(13);
        e7.setAge(29);

        e1.setFirstName("Jennifer");
        e3.setFirstName("Karen");
        e7.setFirstName("Sussan");

        System.out.println(e1.getFirstName()+", Age: "+e1.getAge());
        System.out.println(e3.getFirstName()+", Age: "+e3.getAge());
        System.out.println(e7.getFirstName()+", Age: "+e7.getAge());
    *//*


    */
/*
        Country cArgentina = new Country("Argentina");
        Country cAustralia = new Country("Australia");

        Location lArgentina = new Location("12-98 Victoria street", 2901, "Sidney", "New South Wales", cAustralia);
        Location lAustralia = new Location("20 Rue des Corps-Saints", 1730, "Geneva", "Geneve", cArgentina);

        Department dAdministration = new Department("Administration", lAustralia);
        Department dMarketing = new Department("Marketing", lArgentina);
        Department dPurchasing = new Department("Purchasing", lAustralia);
        Department dHumanResources = new Department("Human Resources", lArgentina);
        Department dShipping = new Department("Shipping", lAustralia);
        Department dIT = new Department("IT", lArgentina);

        Job jAdministrationManager = new Job("Administration Manager", 15000, 30000);
        Job jAdministrationAssistant = new Job("Administration Assistant", 3000, 6000);
        Job jMarketingManager = new Job("Marketing Manager", 9000, 15000);
        Job jMarketingRepresentative = new Job("Marketing Representative", 4000, 9000);
        Job jPurchasingManager = new Job("Purchasing Manager", 8000, 15000);
        Job jPurchasingClerk = new Job("Purchasing Clerk", 2500, 5500);
        Job jHumanResourcesRepresentative = new Job("Human Resources Representative", 4000, 9000);
        Job jShippingClerk = new Job("Shipping Clerk", 2500, 5500);
        Job jProgrammer = new Job("Programmer", 4000, 10000);

        Employee e1 = new Employee("Jennifer", "Whalen", "JWHALEN", "515.123.4444", new Date(2003, 9, 17), jAdministrationManager, dAdministration);
        Employee e2 = new Employee("Karen", "Colmenares", "KCOLMENA", "515.127.4566", new Date(2007, 8, 10), jAdministrationAssistant, dAdministration);
        Employee e3 = new Employee("Michael", "Hartstein", "MHARTSTE", "515.123.5555", new Date(2004, 2, 17), jMarketingManager, dMarketing);
        Employee e4 = new Employee("Pat", "Fay", "PFAY", "603.123.6666", new Date(2005, 8, 17), jMarketingRepresentative, dMarketing);
        Employee e5 = new Employee("Den", "Raphaely", "DRAPHEAL", "515.127.4561", new Date(2002, 7, 12), jPurchasingManager, dPurchasing);
        Employee e6 = new Employee("Sigal", "Tobias", "STOBIAS", "515.127.4564", new Date(2005, 7, 24), jPurchasingClerk, dPurchasing);
        Employee e7 = new Employee("Susan", "Mavris", "SMAVRIS", "515.123.7777", new Date(2002, 6, 2007), jHumanResourcesRepresentative, dHumanResources);
        Employee e8 = new Employee("Winston", "Taylor", "WTAYLOR", "650.507.9876", new Date(2006, 1, 6), jShippingClerk, dShipping);
        Employee e9 = new Employee("Alexander", "Hunold", "AHUNOLD", "590.423.4567", new Date(2006, 1, 3), jProgrammer, dIT);

        dAdministration.setManager(e1);
        dHumanResources.setManager(e7);
        dIT.setManager(e9);
        dMarketing.setManager(e3);
        dPurchasing.setManager(e5);
        dShipping.setManager(e8);

        e1.setSalary(15000);
        e2.setSalary(30000);
        e3.setSalary(5);

        System.out.println(e1.getFirstName() + " " + e1.getLastName() + ", salary: " + e1.getSalary());
        System.out.println(e2.getFirstName() + " " + e2.getLastName() + ", salary: " + e2.getSalary());
        System.out.println(e3.getFirstName() + " " + e3.getLastName() + ", salary: " + e3.getSalary());

        System.out.println("________________________");
        Employee[] employees = dAdministration.getEmployeeList();
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + ", Department: " + employee.getDepartment().getName());
        }

        System.out.println("________________________");
        System.out.println(e1.getDetails());
        *//*


*/
/**
 *
 * @author Humberto
 *//*


        Country cArgentina = new Country("Argentina");
        Country cAustralia = new Country("Australia");

        Location lArgentina = new Location("12-98 Victoria street", 2901, "Sidney", "New South Wales", cAustralia);
        Location lAustralia = new Location("20 Rue des Corps-Saints", 1730, "Geneva", "Geneve", cArgentina);

        Department dAdministration = new Department("Administration", lAustralia);
        Department dMarketing = new Department("Marketing", lArgentina);
        Department dPurchasing = new Department("Purchasing", lAustralia);
        Department dHumanResources = new Department("Human Resources", lArgentina);
        Department dShipping = new Department("Shipping", lAustralia);
        Department dIT = new Department("IT", lArgentina);

        Job jAdministrationManager = new Job("Administration Manager", 15000, 30000);
        Job jAdministrationAssistant = new Job("Administration Assistant", 3000, 6000);
        Job jMarketingManager = new Job("Marketing Manager", 9000, 15000);
        Job jMarketingRepresentative = new Job("Marketing Representative", 4000, 9000);
        Job jPurchasingManager = new Job("Purchasing Manager", 8000, 15000);
        Job jPurchasingClerk = new Job("Purchasing Clerk", 2500, 5500);
        Job jHumanResourcesRepresentative = new Job("Human Resources Representative", 4000, 9000);
        Job jShippingClerk = new Job("Shipping Clerk", 2500, 5500);
        Job jProgrammer = new Job("Programmer", 4000, 10000);
        Job jDirector = new Job("Director", 55000, 105000);
        Job jSecretary = new Job("Secretary", 2500, 4500);

        Employee s1 = new Employee("Susan", "Mavris", "SMAVRIS", "515.123.7777", new Date(2002, 6, 2007), jHumanResourcesRepresentative);
        Employee s2 = new Employee("Winston", "Taylor", "WTAYLOR", "650.507.9876", new Date(2006, 1, 6), jShippingClerk);
        Employee s3 = new Employee("Alexander", "Hunold", "AHUNOLD", "590.423.4567", new Date(2006, 1, 3), jProgrammer);

        Employee m1 = new Manager(s1, "Jennifer", "Whalen", "JWHALEN", "515.123.4444", new Date(2003, 9, 17), jAdministrationManager, dAdministration);
        Employee m2 = new Manager(s2, "Michael", "Hartstein", "MHARTSTE", "515.123.5555", new Date(2004, 2, 17), jMarketingManager, dMarketing);
        Employee m3 = new Manager(s3, "Den", "Raphaely", "DRAPHEAL", "515.127.4561", new Date(2002, 7, 12), jPurchasingManager, dPurchasing);

        Employee e1 = new Employee("Karen", "Colmenares", "KCOLMENA", "515.127.4566", new Date(2007, 8, 10), jAdministrationAssistant);
        Employee e2 = new Employee("Pat", "Fay", "PFAY", "603.123.6666", new Date(2005, 8, 17), jMarketingRepresentative);
        Employee e3 = new Employee("Sigal", "Tobias", "STOBIAS", "515.127.4564", new Date(2005, 7, 24), jPurchasingClerk);

        s1.setDepartment(dHumanResources);
        s2.setDepartment(dShipping);
        s3.setDepartment(dIT);

        e1.setDepartment(dAdministration);
        e2.setDepartment(dMarketing);
        e3.setDepartment(dPurchasing);

        Manager m = (Manager) m1;
        System.out.println("Secretaria de " + m.getFirstName() + " es " + m.getSecretary().getFirstName());
       */
/* m1.setSalary(32000);
        m2.setSalary(45000);
        m3.setSalary(58000);

        e1.setSalary(12000);
        e2.setSalary(16000);
        e3.setSalary(22000);
*//*

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println("_____________________________");
        TaxService taxService = new TaxService();
        System.out.println("Full Salary: $" + m1.getSalary() + " Net Salary: $" + taxService.findNetPay(m1));
        System.out.println("Full Salary: $" + m2.getSalary() + " Net Salary: $" + taxService.findNetPay(m2));
        System.out.println("Full Salary: $" + m3.getSalary() + " Net Salary: $" + taxService.findNetPay(m3));


        Director director = new Director(s3, "William", "Gietz", "WGIETZ", "515.123.8181", new Date(2002, 6, 7), jDirector,dAdministration);
        director.setSalary(m1, 3200);
        director.setSalary(m2, 4500);
        director.setSalary(director, 120000);

        //m1.setSalary(5500);

        System.out.println("___________________");
        System.out.println(director);

    }

}*/