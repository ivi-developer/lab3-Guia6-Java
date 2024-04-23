package punto4;
public class Revista extends Libro{
    private Integer numRevista;
    public Revista(Integer codigo, String titulo, String anioPublicacion, Integer numRevista){
        super(codigo, titulo, anioPublicacion);
        this.numRevista= numRevista;
    }
    @Override
    public String toString() {
        return "Revista{" +super.toString()+
                "numRevista=" + numRevista +
                '}';
    }
}
