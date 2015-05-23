/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4.operadores;

/**
 *
 * @author Humberto
 */
public class OperadorTernario {

    public static void main(String args[]) {
        int edadPedro = 25;

        String opcionl = "Pedro es mayor de edad y puede votar";
        String opcion2 = "Pedro es menor de edad y no puede votar";

        String respuesta = edadPedro >= 18 ? opcionl : opcion2;
        System.out.println(respuesta);
    }
}
