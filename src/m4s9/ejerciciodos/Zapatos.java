package m4s9.ejerciciodos;

public class Zapatos {
    private String marca;

    public Zapatos(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Zapatos{" + "marca='" + marca + '\'' +'}';
    }
}
