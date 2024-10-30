package m4s10.impresora;

public class Documento {
    private IImpresora impresora;

    public Documento(IImpresora impresora) {
        this.impresora = impresora;
    }

    public void imprimirDocumento(String contenido){
        impresora.imprimir(contenido);
    }
}
