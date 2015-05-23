/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4.string;

/**
 *
 * @author Humberto
 */

public class TestConcatenation {

    public static void main(String[] args) {
        //Produces a new String:
        String salutation = "Dr.";
        String name = "Pete" + " " + "Seymour";
        String title = salutation + " " + name;
        System.out.println("Title: " + title);
        //One argument must be a String object:
        //String beString = 25 + 22;
        String beString = "" + 25 + 22;
        System.out.println("beString: " + beString);
    }
}

