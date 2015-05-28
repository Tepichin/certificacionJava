package modulo2.employee.taxs;

/**
 * Created by pablomoreno on 28/05/15.
 */
public abstract interface ITaxServices {
    /*public static final*/ int ANNUAL = 12;

    public double getTaxRate(double ammount);
}
