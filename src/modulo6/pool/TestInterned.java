package modulo6.pool;

/**
 * Created by pablomoreno on 27/05/15.
 */
public class TestInterned {
    public static void main(String[] args) {
        Integer i = 127;
        Integer j = 127;
        Integer k = new Integer(127);


        System.out.println(i == j);
        System.out.println(i == k);
        System.out.println(i.equals(k));
    }

}
