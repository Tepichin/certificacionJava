/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo7.statics;

import com.sun.tools.doclets.internal.toolkit.util.SourceToHTMLConverter;

/**
 * @author Rosa Isela
 */
public class Marciano {

    public static int cuentaMarciano = 0;
    public String color = "";


    public Marciano() {

        cuentaMarciano++;
    }

    public int getCuentaMarciano() {

        return cuentaMarciano;
    }

    public void setCuentaMarciano(int cuentaMarciano) {

        this.cuentaMarciano = cuentaMarciano;
    }

    public void atacar() {
        if (cuentaMarciano >= 5) {
            System.out.println("Atacar");
        } else {
            System.out.println("Retirarse");
        }
    }
}

class TestMarciano {

    static int bar = 0;

    public void foo() {
        System.out.println(bar);
    }

    public static void bar() {
        System.out.println(bar);
    }

    public static void main(String[] args) {
        Marciano m1 = new Marciano();
        Marciano m2 = new Marciano();
        Marciano m3 = new Marciano();
        Marciano m4 = new Marciano();
            /*m1.setCuentaMarciano(3);
            m2.setCuentaMarciano(3);
            m3.setCuentaMarciano(3);
            m4.setCuentaMarciano(5);*/
        m2.atacar();
        System.out.println("Numero total de marciano: " + Marciano.cuentaMarciano);
        System.out.println("Numero total de marciano: " + m1.cuentaMarciano);

    }

}

