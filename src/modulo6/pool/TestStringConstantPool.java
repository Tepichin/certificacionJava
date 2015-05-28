package modulo6.pool;

/**
 * Created by pablomoreno on 27/05/15.
 */
public class TestStringConstantPool {
    public static void main(String[] args) {
        String s = "hola";
        String s2 = "hola";
        String s3 = new String("hola");

        System.out.println(s == s2);
        System.out.println(s == s3);
        System.out.println(s.equals(s3));

    }
}
