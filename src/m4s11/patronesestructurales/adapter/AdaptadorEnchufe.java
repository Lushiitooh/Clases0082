package m4s11.patronesestructurales.adapter;

public class AdaptadorEnchufe implements IEnchufeEuropeo{
    private EnchufeAmericano enchufeAmericano;

    public AdaptadorEnchufe(EnchufeAmericano enchufeAmericano) {
        this.enchufeAmericano = enchufeAmericano;
    }

    @Override
    public void enchufar() {
        enchufeAmericano.conectar();
    }
}
