/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4.cast;

/**
 *
 * @author Humberto
/*
 */

public class TestCasting {

    public static void main(String[] args) {
        long bigValue = 99L;
        int squashed1 = (int)bigValue;      // Wrong, needs a cast
        int squashed2 = (int) bigValue; // OK
        int squashed3 = (int)99L; // Wrong, needs a cast
        int squashed4 = (int)99L;     // OK, but...
        int squashed5 = (int)9218868441522372607L ; // default integer literal
    }
}

