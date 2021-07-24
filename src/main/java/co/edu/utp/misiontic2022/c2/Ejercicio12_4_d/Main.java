package co.edu.utp.misiontic2022.c2.Ejercicio12_4_d;
import java.util.Scanner;

/*
Construir una Clase (y su programa Java respectivo) que permita crear Hexágonos y que muestre, apropiadamente, sus atributos, su área y su perímetro
*/
public class Main {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("¿Cuántos hexágonos quieres constuir?");
        int n=op.nextInt();
        Hexagono[] Hexagonos=new Hexagono[n];
        for (int i=0;i<n;i++){
            System.out.println("Ingresa el lado del hexagono "+(i+1)+":");
            int lado=op.nextInt();
            Hexagonos[i]= new Hexagono(lado,(i+1));
        }
        for (int i=0;i<n;i++){
            Hexagonos[i].MostrarHexagono();
        }
    }
}