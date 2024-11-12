package m4s10.impresora;

public class ImpresoraEpson implements IImpresora{
    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimiendo en Impresora marca Epson: " + documento);
    }
}
