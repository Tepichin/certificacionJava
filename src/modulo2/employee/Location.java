package modulo2.employee;

/**
 * Created by pablomoreno on 21/05/15.
 */
public class Location {
    private String streetAdress;
    private int postalCode;
    private String city;
    private  String stateProvidence;
    private Country country;

    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvidence() {
        return stateProvidence;
    }

    public void setStateProvidence(String stateProvidence) {
        this.stateProvidence = stateProvidence;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
