package modulo7.inner;

/**
 * Created by pablomoreno on 28/05/15.
 */
public class OuterClass {
    int x = 10;

    class InnerClass {
        int x = 10;

        InnerClass(){
            OuterClass.this.x=30;
        }
    }
}
class TestInner{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println("X inner: "+inner.x);
        System.out.println("X outer: "+outer.x);
    }
}
