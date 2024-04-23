package punto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Matematicas implements Extremos{
    ArrayList<Double>doubles;
    public Matematicas(int tamanio){
        doubles=new ArrayList<>();
        for(int i=0;i<tamanio;i++)doubles.add((double)(Math.random()*10));
    }
    @Override
    public double inicio() {return doubles.get(0);}

    @Override
    public double fin() {
        return doubles.get(doubles.size()-1);
    }
    @Override
    public String toString() {
        return "Matematicas{" +
                "doubles=" + doubles +
                '}';
    }
}
