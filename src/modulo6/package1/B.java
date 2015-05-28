/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo6.package1;

/*
 *
 * @author Humberto
 */
public class B {

    private char b;

    private B(char b) {
        this.b = b;
    }

    public char getB() {
        return b;
    }

    public void setB(char b) {
        this.b = b;
    }

    public static void main(String[] args) {
        A a = new A();
        a.setA('a');
        System.out.println("a:" + a.getA());
        System.out.println("a:" + a.a);
        //__________________________________
        A a1 = new A('a');
        System.out.println("a:" + a.a);
        //__________________________________
        B b = new B('b');
        //__________________________________
        A.b = 'b';
    }
}
