package punto3;
public class Numero implements Relaciones{
    private int entero;
    public Numero(int entero){this.entero=entero;}
    public int getEntero(){return entero;}
    @Override
    public boolean esMayor(Object b){
        Numero numero=(Numero)b;
        return this.entero>numero.getEntero();
    }
    @Override
    public boolean esMenor(Object b){
        Numero numero=(Numero)b;
        return this.entero<numero.getEntero();
    }
    @Override
    public boolean esIgual(Object b){
        Numero numero=(Numero)b;
        return this.entero==numero.getEntero();
    }
}
