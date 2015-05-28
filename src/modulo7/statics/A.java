/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *//*

package modulo7.statics;

*/
/**
 *
 * @author Rosa Isela
 *//*

public class A {

    public static final int a;
    public static int b;
    public final int c;

    static {
        a = 1;
        b = 2;
        c = 3;
    }

    public A() {
        a = 4;
        b = 5;
        c = 6;
    }

    public static int getA() {
        System.out.println("A");
        return a;
    }

    public static void setA(int a) {
        A.a = a;
    }

    public void setC(int c) {
        this.c = c;
    }

    public final int getC() {
        return c;
    }
}

class B extends A {

    @Override
    public int getC() {
        return super.getC();
    }

    public static int getA() {
        System.out.println("B");
        return a;
    }

    public static void main(String[] args) {
        A ab = new B();
        ab.getA();
    }
}
*/
