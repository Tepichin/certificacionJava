package modulo3;

/**
 * Created by pablomoreno on 21/05/15.
 */

public class TestPrimitives {
    public static void main(String[] args) {
        /* Logical */
        boolean truth = true;
        System.out.println(truth);

        /*Textual*/
        char c = 'a';
        System.out.println(c);
        char c2 = '\u004b';
        char c3 = '\t';
        System.out.println(c3 + "" + c2);
        String greating = "Googd Morning \n";
        System.out.println(greating);

        /*Integer*/
        byte b = 127;
        byte b1 = -128;
        System.out.println(b + " y " + b1);
        short i = 32267;
        short i1 = -32268;
        int i2 = 2147483647;
        int i3 = -2147483648;
        System.out.println(i + "" + i1 + "" + i2 + "" + i3);
        long l = 9223372036854775807L;

        /*Octal*/
        int six = 06;
        System.out.println("Octal 06 = " + six);

        /*Hexadecimal*/
        int cafe = 0xDeadCafe;
        System.out.println("Hexadecimal cafe = " + cafe);

        /*Floating point*/
        float f = 128.456F; //por default los numeros decimales son double
        double d = 123.456;

        System.out.println("float ="+f + " double = "+ d);
    }
}