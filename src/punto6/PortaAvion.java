package punto6;
public class PortaAvion implements Barcos {
    private int cantAviones;
    private int cantidadTripulacion;

    public PortaAvion(int cantAviones, int cantidadTripulacion) {
        this.cantAviones = cantAviones;
        this.cantidadTripulacion = cantidadTripulacion;
    }
    @Override
    public String msgeSocorro() {
        return "Soy un "+getClass().getSimpleName()+" haciendo un "+Thread.currentThread().getStackTrace()[1].getMethodName();
    }
    @Override
    public String alarma() {
        return "Soy un "+getClass().getSimpleName()+" haciendo una "+Thread.currentThread().getStackTrace()[1].getMethodName();
    }
}