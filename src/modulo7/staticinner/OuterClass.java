package modulo7.staticinner;
import modulo7.staticinner.OuterClass.InnerClass;

/**
 * Created by pablomoreno on 28/05/15.
 */
public class OuterClass {
    static int x = 10;

    static class InnerClass {
        int x = 20;

        InnerClass(){
            System.out.println(OuterClass.x);
        }
    }
}

class TestInner{
    public static void main(String[] args) {
        OuterClass.InnerClass ic = new OuterClass.InnerClass();

    }
}
