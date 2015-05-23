/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4.operadores;

/**
 *
 * @author Humberto
 */
public class DeComparacion {

    public static void main(String[] args) {

        isItSmall(5);
    }
    public static boolean isItSmall(int i) {
        if (i < 5) {
            System.out.println("i < 5");
            return true;
        } else {
            System.out.println("i >= 5");
            return false;
        }
    }
}
