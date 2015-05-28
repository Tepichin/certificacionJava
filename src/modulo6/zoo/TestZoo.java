package modulo6.zoo;

/**
 * Created by pablomoreno on 26/05/15.
 */
public class TestZoo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Jirafa jirafa = new Jirafa();
        Leon leon = new Leon();
        Mono mono = new Mono();
        Elefante elefante = new Elefante();
        Rinoceronte rinoceronte = new Rinoceronte();
        Serpiente serpiente = new Serpiente();

        alimentarAnimal(jirafa);
        alimentarAnimal(leon);
        alimentarAnimal(mono);
        alimentarAnimal(elefante);
        alimentarAnimal(rinoceronte);
        alimentarAnimal(serpiente);
    }
/*    public static void alimentarAnimal(Jirafa jirafa){
        jirafa.alimentar();
    }
    public static void alimentarAnimal(Leon leon){
        leon.alimentar();
    }
    public static void alimentarAnimal(Mono mono){
        mono.alimentar();
    }*/

    public static void alimentarAnimal(Animal animal) {
        animal.alimentar();
    }
}
