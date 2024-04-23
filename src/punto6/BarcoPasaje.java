package punto6;
public class BarcoPasaje implements Barcos{
    private int cantCamas;
    public BarcoPasaje(int cantCamas){this.cantCamas=cantCamas;}
    @Override
    public String msgeSocorro() {
        return "Soy un "+getClass().getSimpleName()+" haciendo un "+Thread.currentThread().getStackTrace()[1].getMethodName();
    }
    @Override
    public String alarma() {
        return "Soy un "+getClass().getSimpleName()+" haciendo una "+Thread.currentThread().getStackTrace()[1].getMethodName();
    }
}