/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4.fors;

/**
 *
 * @author Humberto
 */
public class TestLabeled {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("j: " + j);
                for (int k = 0; k < 5; k++) {
                    System.out.println("k: " + k);
                }
            }
        }
    }
}
