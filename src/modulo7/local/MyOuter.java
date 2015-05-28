/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo7.local;

/**
 * @author Humberto
 */
public class MyOuter {

    char c = 'C';

    public class A {

        void innerMethod() {

            System.out.println("B" + c);
        }
    }
    public void otherMethod() {
        final char d='D';
        final char c='L';
        class A {
            void innerMethod() {
                System.out.println("A"+MyOuter.this.c+d);
            }
        }
        A a = new A();
        a.innerMethod();
        MyOuter.A in = new MyOuter.A();
        in.innerMethod();
    }
}

class App2 {
    public static void main(String args[]) {
        MyOuter m = new MyOuter();
        m.otherMethod();
    }
}