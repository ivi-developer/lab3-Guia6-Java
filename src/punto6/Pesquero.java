package punto6;
public class Pesquero implements Barcos{
    private String nombre;
    private int cantPescadores;
    private int caballosDeFuerza;
    public Pesquero(String nombre,int cantPescadores,int caballosDeFuerza){
        this.nombre=nombre;
        this.cantPescadores=cantPescadores;
        this.caballosDeFuerza=caballosDeFuerza;
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
