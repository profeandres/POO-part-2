package co.edu.utp.misiontic2022.c2.Ejercicio12_4_f;
import java.util.Scanner;

/*
Construir una Clase (y su programa Java respectivo) que permita crear
Decágonos y que muestre, apropiadamente, sus atributos, su área y su
perímetro
 */
public class Main {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("¿Cuántos Decágonos quieres crear?");
        int n=op.nextInt();
        Decagono Decagonos[]=new Decagono[n];
        for (int i=0;i<n;i++){
            System.out.println("Digita el lado del decágono: ");
            int lado=op.nextInt();
            Decagonos[i]=new Decagono(lado,(i+1));
        }
        for (int i=0;i<n;i++){
            Decagonos[i].MostrarDecagono();
        }
    }
}