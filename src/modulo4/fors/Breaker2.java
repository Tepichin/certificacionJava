/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4.fors;

/**
 * @author Humberto
 */
public class Breaker2 {

    public static void main(String args[]) {
        go();
    }

    public static void go() {
        String o = "";
        z:
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 2; y++) {
                if (x == 1) break;
                if (x == 2 && y == 1)
                    break z;
                o = o + x + y;
            }
        }
        System.out.println(o);
    }
}