/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4.fors;

/**
 *
 * @author Humberto
 */
public class TestLoop {

    public static void main(String args[]) {
        int i = 0;
        for (/*Valores de entrada*/;/*Condicion de terminacion */;/*Iteracion por ciclo*/) {
            System.out.println(i);
            if (i == 5) {
                System.out.println("Termina");
                break;
            }
            i++;
        }
        for (int j = 0; j < 6; j++) {
            System.out.println(j);
        }
        System.out.println("Termina");
    }
}
