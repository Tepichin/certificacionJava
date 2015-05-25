package modulo4.fors;

/**
 * Created by pablomoreno on 23/05/15.
 */
public class TestBreak {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            if(i==5){
                break;
            }else{
                continue;
            }
        }
    }
}
