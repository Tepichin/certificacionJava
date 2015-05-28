package modulo6.wrapper;

public class Wrapper4 {
    int i;
    Integer j;
    int sum = 10;

    Wrapper4() {
        sum += i + j;
        System.out.println(sum);
    }

    public static void main(String args[]) {

        new Wrapper4();
    }
}