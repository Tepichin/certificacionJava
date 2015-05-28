package modulo9.set_example;

import java.util.HashSet;
import java.util.Set;

public class HashExample {

    public static void main(String[] args) {
        Set set = new HashSet();
        Numbers n1 = new Numbers(3);
        Numbers n2 = new Numbers(2);
        Numbers n3 = new Numbers(7);
        Numbers n4 = new Numbers(3);
        
        set.add(n1);
        set.add(n2);
        set.add(n3);
        set.add(n4);
        
        System.out.println(set);
    }
}

class Numbers{
    
    private int num;

    public Numbers(int num) {
        this.num = num;
    }
        
    public String toString(){
        return num + " ";
    }

}
