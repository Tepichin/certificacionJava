package modulo9.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {

    public static void main(String[] args) {
        // Invariant Example
        List<Employee> employees = new ArrayList<Employee>();
        List<Manager> employees2 = new ArrayList<Manager>();
        List<Director> employees3 = new ArrayList<Director>();
        List<Employee> employees4 = new ArrayList<Employee>();

        employees = employees4;
        //employees = employees2;

        // Convariant Example
        List<? extends Manager> list;
        List<Employee> list2 = new ArrayList<Employee>();
        List<Manager> list3 = new ArrayList<Manager>();
        List<Director> list4 = new ArrayList<Director>();
        //list = list2;
        list = list3;
        list = list4;

        //Contravariant Example
        List<? super Manager> lista;
        List<Employee> lista2 = new ArrayList<Employee>();
        List<Manager> lista3 = new ArrayList<Manager>();
        List<Director> lista4 = new ArrayList<Director>();
        lista = lista2;
        lista = lista3;
        //lista = lista4;
    }
}

class Employee {
}

class Manager extends Employee {
}

class Director extends Manager {
}