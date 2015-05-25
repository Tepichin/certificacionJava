package modulo5.arrays;
/**
 * Created by pablomoreno on 23/05/15.
 */
public class TestArray {
    public static void main(String[] args) {
        char [] c;
        c = new char[2];

        c[0] = 'A';
        c[1] = 'B';
        //c[2] = 'C';
        System.out.println(c[0]+""+ c[1]);

        MyDate[] md;
        md = new MyDate[2];

        md[0] = new MyDate(19,11,1986);
        MyDate date = new MyDate(25,5,2015);
        md[1] = date;
        System.out.println(md[0].show());
        System.out.println(md[1].show());
    }
}