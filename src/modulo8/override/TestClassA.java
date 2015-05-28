package modulo8.override;

public class TestClassA {
    public static void main(String[] args) {
        ClassB ref = new ClassB();
        try{
            ref.method1();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }    
    }
}
