package modulo7.enumsv2;

/**
 * Created by pablomoreno on 27/05/15.
 */
public enum Cafe {
    CHICO(120.5, 15.5),
    MEDIANO(180, 20.43),
    GRANDE;

    private double mililitros;
    private double precio;

    Cafe(double mililitros, double precio) {
        this.mililitros = mililitros;
        this.precio = precio;
    }

    Cafe() {
        this.mililitros = 250.5;
        this.precio = 22.5;
    }

    public double getMililitros() {
        return mililitros;
    }

    public void setMililitros(double mililitros) {
        this.mililitros = mililitros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
