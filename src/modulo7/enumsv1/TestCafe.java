package modulo7.enumsv1;

/**
 * Created by pablomoreno on 27/05/15.
 */
public class TestCafe {
    public static void main(String[] args) {
        pedirCafe(Cafe.CHICO);
        pedirCafe(Cafe.GRANDE);
    }
        public static void pedirCafe(int tamano){
            switch (tamano){
                case Cafe.CHICO:
                    System.out.println("Sirviendo cafe chico");

                    break;
                case Cafe.MEDIANO:
                    System.out.println("Sirviendo cafe mediano");

                    break;
                case Cafe.GRANDE:
                    System.out.println("Sirviendo cafe grande");

                    break;
                default:
                    System.out.println("Opcion incorrecta");

            }
    }
}
