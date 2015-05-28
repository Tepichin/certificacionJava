package modulo8.example;

public class AddArguments3 {

    public static void main(String[] args) {
        
        int sum = 0;
        for(String tmp:args){
            try{
               sum += Integer.parseInt(tmp);            
            }catch(NumberFormatException e){
                System.err.println("One of the command line arguments is not an integer");
            }
        }
        System.out.println("Sum =" + sum);        
    }
}
