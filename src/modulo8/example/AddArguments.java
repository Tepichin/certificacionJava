package modulo8.example;

public class AddArguments {
    
    public static void main(String[] args) {
        
        int sum = 0;
        for(String tmp:args){
            try{
                sum += Integer.parseInt(tmp);
            }catch (NumberFormatException nfe){
                System.out.println("La cadena "+tmp+ "no es un numero");
            }catch (IllegalArgumentException iae){

            }catch (RuntimeException re){

            }catch (Exception e){

            }
        }
        System.out.println("Sum =" + sum);        
    }
}
