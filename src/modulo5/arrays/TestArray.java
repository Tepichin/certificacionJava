package modulo5.arrays;

/**
 * Created by pablomoreno on 23/05/15.
 */
public class TestArray {
    public static void main(String[] args) {
        char[] c;
        c = new char[2];

        c[0] = 'A';
        c[1] = 'B';
        //c[2] = 'C';
        System.out.println(c[0] + "" + c[1]);

        MyDate[] md;
        md = new MyDate[2];

        md[0] = new MyDate(19, 11, 1986);
        MyDate date = new MyDate(25, 5, 2015);
        md[1] = date;
        System.out.println(md[0].show());
        System.out.println(md[1].show());

        String[] names = {
                "Georgina",
                "Jen",
                "Simon"
        };

        for (String name : names) {
            System.out.println(name);
        }

        //System.out.println(names[2]);

        /*Multidimensional Arrays*/

        int[][][] x = new int[2][][];
        x[0] = new int[2][];
        x[0][0] = new int[3];
        x[0][1] = new int[4];
        x[0][1][0] = 5;
        x[0][0][2] = 6;
        System.out.println(x[0][1][0]);
        System.out.println(x[0][0][2]);

        x[1] = new int[2][2];
        x[1][0] = new int[3];
        x[1][1] = new int[2];
        x[1][1][0] = 5;
        x[1][0][2] = 6;

        for (int i = 0; i < x.length; i++) {
            int[][] x1 = x[i];
            for (int j = 0; j < x1.length; j++) {
                int[] x2 = x1[j];
                for (int k = 0; k < x2.length; k++) {
                    int y = x2[k];
                    System.out.println(y);
                }
            }
        }
        for (int[][] ises : x) {
            for (int[] is : ises) {
                for (int i : is) {
                    System.out.println(i);
                }
            }
        }

        int[] myArray = {1, 2, 3, 4, 5, 6};
        int[] hold = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.arraycopy(myArray, 1, hold, 1, 3);
        System.out.println("");
        System.out.println("");
        for (int i : hold) {
            System.out.println(i);
        }
    }
}
