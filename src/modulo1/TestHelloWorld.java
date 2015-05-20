package modulo1;

/**
 * Created by pablomoreno on 20/05/15.
 */
public class TestHelloWorld {

    public static void main(String [] args){
        HelloWorld hello=new HelloWorld();
        hello.greet();
    }
}

class HelloWorld{
    public void greet(){
        System.out.println("Hello Word Java!!!!");
    }
}