package co.edu.utp.misiontic2022.c2.Ejercicio12_4_e;
import java.util.Scanner;
/*Construir una Clase (y su programa Java respectivo) que permita crear
Octágonos y que muestre, apropiadamente, sus atributos, su área y su
perímetro*/
public class Main {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("¿Cuántos octagonos quieres crear?");
        int n= op.nextInt();
        Octagono Octagonos[]= new Octagono[n];
        for (int i=0;i<n;i++){
            System.out.println("Cuánto mide el lado del octagono "+(i+1)+":");
            double lado=op.nextDouble();
            Octagonos[i]=new Octagono(lado,(i+1));
        }
        for (int i=0;i<n;i++){
            Octagonos[i].MostrarOctagono();
        }
    }
    
}