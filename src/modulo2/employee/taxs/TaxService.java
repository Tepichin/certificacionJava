/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo2.employee.taxs;

import modulo2.employee.Employee;
import modulo2.employee.Manager;
import sun.jvm.hotspot.runtime.amd64.AMD64RegisterMap;

/**
 * @author Humberto
 */
public class TaxService implements ITaxServices {

    public double getTaxeRate(Employee e) {
        if (e.getSalary() * 12 > 400000.00) {
            return 0.40;
        } else if (e.getSalary() * 12 > 300000.00) {
            return 0.30;
        } else if (e.getSalary() * 12 > 200000.00) {
            return 0.20;
        } else if (e.getSalary() * 12 > 100000.00) {
            return 0.10;
        } else {
            return 0.05;
        }
    }

    public double findNetPay(Employee e) {
        double bonus = 0;
        if (e instanceof Manager) {
            System.out.println("e hace referencia a manager manager");
            bonus = 1500.0;

        }

        return e.getSalary() + bonus - e.getSalary() * getTaxeRate(e);
    }

    @Override
    public double getTaxRate(double ammount) {
        if (ammount * ANNUAL > 400000.00) {
            return 0.40;
        } else if (ammount * ANNUAL > 300000.00) {
            return 0.30;
        } else if (ammount * ANNUAL > 200000.00) {
            return 0.20;
        } else if (ammount * ANNUAL > 100000.00) {
            return 0.10;
        } else {
            return 0.05;
        }
    }
}
