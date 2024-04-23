package punto5;
import java.util.ArrayList;
import java.util.List;
public class Pila implements ColeccionInterfaz{
    private List<Integer>pila;
    private int contador;
    public Pila(){
        pila=new ArrayList<>();
        contador=0;
    }
    @Override
    public boolean estaVacia() {
        if(pila.isEmpty())return true;
        return false;
    }
    @Override
    public int extraer(){
        int tope= primero();
        if(!estaVacia()) pila.remove(0);
        return tope;
    }
    @Override
    public int primero(){
        int tope=-1;
        if(!estaVacia())tope= pila.get(0);
        return tope;
    }
    @Override
    public boolean aniadir(int n){
        if(contador==0||!estaVacia()){
            pila.add(n);
            return true;
        }
        return false;
    }
}
