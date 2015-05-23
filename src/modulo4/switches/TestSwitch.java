package modulo4.switches;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Humberto
 */
public class TestSwitch {

    public static void main(String[] args) {
        byte b = 2;
        short s = 2;
        int i = 2;
        long l = 2;
        char c = 'a';

        switch (i) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
            default:
                System.out.println("default");
                break;
        }
        /*switch (c) {
         case 'a':
         System.out.println("a");
         break;
         case 'b':
         System.out.println("b");
         break;
         default:
         System.out.println("default");
         break;
         }*/
    }
}
