package modulo6.arguments;

public class VariableArguments {
    
    public void method(int i) {
        System.out.println("Method A");
    }
    
    public void method(Integer i) {
        System.out.println("Method B");
    }
    
    public void method(int... i) {
        System.out.println("Method C");
    }
    
    public void method(Short i) {
        System.out.println("Method D");
    }
    
    public void method( String s, boolean b,int... i ){
        System.out.println("Method E");
    }
    
    public static void main(String args[]) {
        //public static void main(String...a) {
        //public static void main(String.* a) {
        //public static void main(String[]... a) {
        //public static void main(String... a[]) {
        //public static void main(String args[][][][][][][][][][]){
        //public static void main(String []args[]){
        VariableArguments va = new VariableArguments();
        int i = 1;
        short s = 1;
        long l = 1;
        //va.method(i);
        va.method(s);
        //va.method(l);
    }
}
