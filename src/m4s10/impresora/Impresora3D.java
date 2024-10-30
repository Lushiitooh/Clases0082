package m4s10.impresora;

public class Impresora3D implements IImpresora{
    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimiendo con Impresora 3D: " + documento);
    }
}
