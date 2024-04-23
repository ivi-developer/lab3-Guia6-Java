package punto1;

import java.util.ArrayList;
import java.util.Optional;

public class ArrayReales implements Estadisticas{
    private ArrayList<Integer>listaInteger;
    public ArrayReales(){listaInteger=new ArrayList<>();}
    public void agregarInteger(Integer integer){listaInteger.add(integer);}
    @Override
    public double minimo(){
        Optional<Integer> min=listaInteger.stream().min(Integer::compareTo);
        return min.orElse(0).doubleValue();
    }
    @Override
    public double maximo(){
        Optional<Integer>max=listaInteger.stream().max(Integer::compareTo);
        return max.orElse(0).doubleValue();
    }
    @Override
    public double sumatorio(){return listaInteger.stream().reduce(0,(a,b)->a+b);}
}
