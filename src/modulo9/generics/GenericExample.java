package modulo9.generics;

import java.util.ArrayList;
import java.util.List;


public class GenericExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        //list.add("dos");// It isn´t an Integer
        list.add(1);
        for(Integer element:list){
            System.out.print(element + ",");
        }
    }
}
