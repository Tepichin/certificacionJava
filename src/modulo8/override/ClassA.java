package modulo8.override;

import java.io.IOException;

public class ClassA {
    
    public void method1() throws IOException{
        System.out.println("method1");
    }
}

class ClassB extends ClassA{
    
    //Insert code here

    @Override
    public void method1() throws IOException {
        super.method1();
    }
}
