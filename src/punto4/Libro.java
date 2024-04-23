package punto4;

public class Libro implements Prestable{
    private Integer codigo;
    private String titulo;
    private String anioPublicacion;
    private Boolean prestado;
    public Libro(Integer codigo,String titulo,String anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        prestado = false;
    }
    @Override
    public String toString() {
        return "Libro{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", anioPublicacion='" + anioPublicacion + '\'' +
                ", prestado=" + prestado +
                '}';
    }
    @Override
    public void prestar(){prestado=true;}
    @Override
    public void devolver(){prestado=false;}
}


