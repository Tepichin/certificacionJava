package modulo8.finallyclause;


public class FinallyExample {
    
    public static void main(String[] args) {
        ThrowException ref = new ThrowException();
        try{
            ref.invokeMethod1();            
        }catch(Exception e){
            System.out.println("Exception type: " + e.getClass().getName());
             //int div = 5/0;
        }finally{
            System.out.println("This always prints \"see you later\"");
        }
        System.out.println("other");
    }
        
}
class ThrowException{
    
    public void invokeMethod1(){

        method1();
    }
    
    public void method1(){
        Integer.parseInt("something");
        //Integer.parseInt("5");
    }
    
}
