package modelo;

public class Location {
    private String city;
    private String country_name;

    // Getters y setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    @Override
    public String toString() {
        return "Ubicación: " + city + ", " + country_name;
    }
}