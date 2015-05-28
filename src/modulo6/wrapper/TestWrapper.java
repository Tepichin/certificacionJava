package modulo6.wrapper;

import com.sun.org.apache.xerces.internal.impl.dv.xs.BooleanDV;

/**
 * Created by pablomoreno on 27/05/15.
 */
public class TestWrapper {
    public static void main(String[] args) {
        Integer i = new Integer(5);
        Integer i5 = 5;//autoboxing
        i5++;//unboxing
        byte b = i.byteValue();
        int j = Integer.parseInt("25");
        String s = new String("Hola Pegrito");

        Boolean untruth = new Boolean("false");
        boolean truth = Boolean.valueOf("true");

        System.out.println("i: " + i);
        System.out.println("i5: " + i5);
        System.out.println("b: " + b);
        System.out.println("j: " + j);
        System.out.println("untruth: " + untruth);
        System.out.println("truth: " + truth);
    }
}
