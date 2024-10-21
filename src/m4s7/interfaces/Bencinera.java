package m4s7.interfaces;

public class Bencinera implements ICombustible{

    @Override
    public void llenarTanque() {
        System.out.println("Se estan llenando los estanques de bencina 93");
    }
}
