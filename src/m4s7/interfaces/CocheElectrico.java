package m4s7.interfaces;

import m4s7.herencia.vehiculo.Coche;

public class CocheElectrico implements IVehiculo, IElectrico {
    private String modelo;
    private int nivelBateria;

    public CocheElectrico(String modelo, int nivelBateria) {
        this.modelo = modelo;
        this.nivelBateria = nivelBateria;
    }

    @Override
    public void cargarBateria() {

    }

    @Override
    public void arrancar() {
        System.out.println("El auto esta andando");
    }

    @Override
    public void detener() {

    }
}
