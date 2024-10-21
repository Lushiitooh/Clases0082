package m4s7.interfaces;

public class MotoCombustion implements IVehiculo, ICombustible{
    private String modelo;
    private int nivelCombustible;

    public MotoCombustion(String modelo, int nivelCombustible) {
        this.modelo = modelo;
        this.nivelCombustible = nivelCombustible;
    }

    @Override
    public void llenarTanque() {
        System.out.println("Se esta hechando bencina del 93");
    }

    @Override
    public void arrancar() {
        System.out.println("La Moto esta andando");
    }

    @Override
    public void detener() {

    }
}
