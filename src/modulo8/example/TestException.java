package modulo8.example;

import javax.lang.model.type.ArrayType;

class TestEx {

    public static void main(String[] args) {

        doStuff();
        System.out.println("Hola2");
    }

    static void doStuff() {

        doMoreStuff();
        System.out.println("Hola1");
    }

    static void doMoreStuff() {
        try{
            int x = 5 / 0; // Can't divide by zero! ArithmeticException is thrown here
        }
        catch (ArithmeticException ae){
            System.out.println("Hola");
        }
        System.out.println("adsaf");

    }
}