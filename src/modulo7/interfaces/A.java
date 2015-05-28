/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modulo7.interfaces;


/**
 *
 * @author Humberto
 */

public interface A {

    static int A=0;

    void method1();

    void method2();
}

interface Z{

}

interface B extends A,Z{
    
 void method3();
}
class C implements B{
    @Override
    public void method3() {
    }

    @Override
    public void method1() {
    }

    @Override
    public void method2() {
    }

}