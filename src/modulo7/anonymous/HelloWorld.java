/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo7.anonymous;

/**
 * @author Humberto
 */
public abstract class HelloWorld {

    public abstract void greet();
}

class TestHelloWorld {

    char x = 'd';
    HelloWorld englishGreeting = new HelloWorld() {
        @Override
        public void greet() {

            System.out.println("Hello Worl" + x);
        }
    };

    public static void main(String[] args) {
        final char z = 'A';
        HelloWorld spanishGreeting = new HelloWorld() {
            static final char z = 'o';

            @Override
            public void greet() {

                System.out.println("Hola Mund" + z);
            }
        };

        TestHelloWorld t = new TestHelloWorld();
        t.englishGreeting.greet();
        spanishGreeting.greet();

        new Thread(new Runnable(){
            @Override
            public void run() {

            }
        });


    }
}
