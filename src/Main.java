import punto1.ArrayReales;
import punto2.Matematicas;
import punto3.Numero;
import punto4.Libro;
import punto4.Revista;
import punto5.Pila;
import punto5.PruebaPila;
import punto6.BarcoPasaje;
import punto6.Pesquero;
import punto6.PortaAvion;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner tec=new Scanner(System.in);
        do{
            System.out.println("Ingrese ejercicio: ");
            switch (tec.nextInt()){
                case 1:
                    punto1();
                    break;
                case 2:
                    punto2();
                    break;
                case 3:
                    punto3();
                    break;
                case 4:
                    punto4();
                    break;
                case 5:
                    punto5();
                    break;
                case 6:
                    punto6();
                    break;
                default:
                    System.out.println("flashaste wachin");
                    break;
            }
            System.out.println("n para cortar");
        }while(tec.next().charAt(0)!='n');
    }
    public static void punto1(){
        ArrayReales arrayReales=new ArrayReales();
        arrayReales.agregarInteger(1);
        arrayReales.agregarInteger(2);
        arrayReales.agregarInteger(3);
        arrayReales.agregarInteger(4);
        arrayReales.agregarInteger(5);
        System.out.println("maximo= "+arrayReales.maximo());
        System.out.println("minimo= "+arrayReales.minimo());
        System.out.println("sumatoria= "+arrayReales.sumatorio());
    }
    public static void punto2(){
        Matematicas matematicas=new Matematicas(5);
        System.out.println(matematicas.toString());
        System.out.println(matematicas.inicio());
        System.out.println(matematicas.fin());
    }
    public static void punto3(){
        Numero numero=new Numero(5);
        Numero numero1=new Numero(3);
        Numero numero2=new Numero(6);
        Numero numero3=new Numero(5);
        System.out.println(numero.esIgual(numero1));
        System.out.println(numero1.esMayor(numero2));
        System.out.println(numero2.esMayor(numero3));
    }
    public static void punto4(){
        Libro libro1= new Libro(66437, "Manuelita", "25/5/87");
        Revista revista1= new Revista(5543, "Billiken", "23/7/2012", 4);
        Libro libro2= new Libro(9987, "Pinoccio", "8/2/1962");
        Revista revista2= new Revista(8767, "Genios", "14/8/2013",6);
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(revista1.toString());
        System.out.println(revista2.toString());
    }
    public static void punto5(){
        Pila pila=new Pila();
        PruebaPila pruebaPila=new PruebaPila();
        pruebaPila.rellenar(pila);
        pruebaPila.imprimirYVaciar(pila);
    }
    public static void punto6(){
        BarcoPasaje barcoPasaje=new BarcoPasaje(5);
        System.out.println(barcoPasaje.msgeSocorro());
        System.out.println(barcoPasaje.alarma());
        Pesquero pesquero=new Pesquero("culo",5,1000);
        System.out.println(pesquero.alarma());
        System.out.println(pesquero.msgeSocorro());
        PortaAvion portaAvion=new PortaAvion(5,100);
        System.out.println(portaAvion.alarma());
        System.out.println(portaAvion.msgeSocorro());
    }
}