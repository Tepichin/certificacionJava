package modulo2.employee;

/**
 * Created by pablomoreno on 21/05/15.
 */
public  enum Country {
    ARGENTINA("Argentina"),
    AUSTRALIA("Australia");

    private String name;


    private Country(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}