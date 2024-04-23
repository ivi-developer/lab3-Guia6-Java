package punto5;
public class PruebaPila{
    public PruebaPila(){}
    //RECIBO CUALQUIER OBJETO QUE IMPLEMENTE LA INTERFAZ Y LO CASTEO
    public void rellenar(ColeccionInterfaz coleccionInterfaz){for(int i=0;i<10;i++) if(coleccionInterfaz instanceof Pila pila) pila.aniadir(i+1);}
    public void imprimirYVaciar(ColeccionInterfaz coleccionInterfaz){
        Pila pila= (Pila)coleccionInterfaz;
        while(!pila.estaVacia()) System.out.println(pila.extraer());
    }
}
