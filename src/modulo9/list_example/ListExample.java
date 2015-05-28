package modulo9.list_example;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {        
        List list = new ArrayList();
        list.add("one");
        list.add("second");
        list.add("3rd");
        list.add(new Integer(4));
        list.add(new Float(5.0F));
        list.add("second"); //duplicate, is added
        list.add(new Integer(4)); //duplicate, is added
        System.out.println(list);
        
        System.out.println("The element at index 3: " + list.get(3));
        System.out.println("The index of element \"second\": " + list.indexOf("second"));
        System.out.println("Add an element \"six\" at index 5");
        list.add(5, "six");
        System.out.println(list);
        
    }
}
