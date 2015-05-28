package modulo8.example;

public class AddArguments2 {

    public static void main(String[] args) {
        try {
            int sum = 0;
            for (String tmp : args) {

                sum += Integer.parseInt(tmp);
            }

            System.out.println("Sum =" + sum);
        } catch (NumberFormatException e) {
            System.err.println("One of the command line arguments is not an integer");
        }
    }
}
