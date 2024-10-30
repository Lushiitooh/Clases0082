package m4s10.impresora;

public class ImpresoraLaser implements IImpresora{
    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimiendo en impresora Laser: " + documento);
    }
}
