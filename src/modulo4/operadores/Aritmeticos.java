/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4.operadores;

/**
 *
 * @author Humberto
 */
public class Aritmeticos {

    public static void main(String args[]) {
        int a = 3, b, s;
        b = a++;
        System.out.println("b vale  " + b);
        s = ++b * ++a;
        System.out.println("s vale  " + s);
    }
}