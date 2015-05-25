/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4.fors;

/**
 * @author Humberto
 */
public class TestLabeled {

    public static void main(String[] args) {

        lab1:
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
            if (i == 2) {
                break;
            }
            lab2:
            for (int j = 0; j < 5; j++) {
                System.out.println("j: " + j);
                if (j == 2) {
                    break;
                }
                lab3:
                for (int k = 0; k < 5; k++) {
                    System.out.println("k: " + k);
                    if (k == 3) {
                        continue lab1;
                    }
                    if (k == 4) {
                        break lab2;
                    }
                }
            }
        }
    }
}
