/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4.operadores;

/**
 *
 * @author Humberto
 */
public class Asignacion {

    public static void main(String[] args) {
        int x = 10;
        x += 5;
        System.out.println("x += 5 [" + x + "]");
        x %= 4;
        System.out.println("x %= 5 [" + x + "]");

        x = 12;
        x &= 12;
        System.out.println("x &= 12 [" + x + "]");
    }
}
