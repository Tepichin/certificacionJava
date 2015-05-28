package modulo7.enumsv2;

/**
 * Created by pablomoreno on 27/05/15.
 */
public class TestCafe {
    public static void main(String[] args) {
        pedirCafe(Cafe.CHICO);
        pedirCafe(Cafe.MEDIANO);
        pedirCafe(Cafe.GRANDE);
        System.out.println("Mililitros del cafe chico: "+Cafe.CHICO.getMililitros() );
        System.out.println("Precio de cafe chico: $"+Cafe.CHICO.getPrecio());
        System.out.println("Mililitros del cafe mediano: "+Cafe.MEDIANO.getMililitros() );
        System.out.println("Mililitros del cafe grande: "+Cafe.GRANDE.getMililitros() );

        Cafe cafe = Cafe.GRANDE;
        System.out.println("Precio del cafe GRANDE: $"+cafe.getPrecio());
        System.out.println("Name: "+cafe.name());
        System.out.println("Equals: "+ cafe.equals(Cafe.GRANDE));

        Cafe[] CAFESES = Cafe.values();


    }
    public static void pedirCafe(Cafe tamano){
        switch (tamano){
            case CHICO:
                System.out.println("Sirviendo cafe chico.");
                break;
            case MEDIANO:
                System.out.println("Sirviendo cafe mediano.");
                break;
            case GRANDE:
                System.out.println("Sirviendo cafe grande.");
                break;
            default:
                System.out.println("Esto nunca se ejecuta");
        }
    }
}
