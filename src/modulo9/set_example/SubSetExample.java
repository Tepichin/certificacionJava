package modulo9.set_example;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubSetExample {

    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(13);
        set.add(25);
        set.add(17);
        set.add(2);
        set.add(10);
        System.out.println("Set: " + set);
        NavigableSet subSet = ((NavigableSet)set).subSet(10, true, 17, true);
        System.out.println("SubSet [10-17]: " + subSet);        
        System.out.println("Adding an element in subSet: " +subSet);
        subSet.add(12);
        System.out.println("Adding an element in subSet out of range: ");
        subSet.add(3);                
    }
}
