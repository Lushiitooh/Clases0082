package m4s9.ejemplogenericos;
/*
Tipos de datos: T
Otros tipos de datos: S, U, V
Elementos: E
Clave: K
Valor: V

 */
class Par<T,U> {
    private T primero;
    private U segundo;

    public Par(T primero, U segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public T getPrimero() {
        return primero;
    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }

    public U getSegundo() {
        return segundo;
    }

    public void setSegundo(U segundo) {
        this.segundo = segundo;
    }

    public void mostrarTipos(){
        System.out.println("El tipo T es:  "+ primero.getClass().getName());
        System.out.println("El tipo U es:  "+ segundo.getClass().getName());
    }

}


