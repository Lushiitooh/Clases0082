package m4s10.impresora;

public class ImpresoraMultifuncional implements IImpresora{

    @Override
    public void imprimir(String documento) {
        System.out.println("Impriendo documento en impresora multifuncional: " + documento);
    }
}
