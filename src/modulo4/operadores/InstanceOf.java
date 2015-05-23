/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4.operadores;

/**
 *
 * @author Humberto
 */
public class InstanceOf {

    public static void main(String args[]) {
        String s = new String("No leas esto, solo es un ejemplo");
        if (s instanceof String) {
            System.out.println("Efectivamente s pertenece a la clase String");
        }
    }
}