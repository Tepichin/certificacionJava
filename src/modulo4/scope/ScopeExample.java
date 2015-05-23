package modulo4.scope;

class ScopeThingie {
    /*
     * Variable de instancia se inicializan
     * con su valor por defecto, mostrado 
     * en la diapositiva 7.
     */
    //Variable de instancia

    private int i = 1;

    public void firstMethod() {
        /*
         * Las variables locales deben
         * estar inicializadas antes
         * de ser utilizadas.
         */
        //System.out.println("Valor por defaul en variables de instancia: " + this.i);
        //Variable local        
        int i = 4, j = 5;
        this.i = i + j;
        secondMethod(7);
    }

    public void secondMethod(/*Variable Local*/int i) {
        //Variable local
        int j = 8;
        // Variable local no inicializada
        //int j;
        this.i = i + j;
    }

    public int getValue() {
        return i;
    }
}

public class ScopeExample {

    public static void main(String[] args) {
        ScopeThingie scope = new ScopeThingie();
        System.out.println("Original i = " + scope.getValue());
        scope.firstMethod();
        System.out.println("New      i = " + scope.getValue());
    }
}
