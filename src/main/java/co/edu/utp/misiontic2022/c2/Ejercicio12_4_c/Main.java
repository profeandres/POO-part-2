package co.edu.utp.misiontic2022.c2.Ejercicio12_4_c;
import java.util.Scanner;
/*
Construir una Clase (y su programa Java respectivo) que permita crear Pentágonos y que muestre, apropiadamente, sus atributos, su área y su perímetro
*/
public class Main {
    private static Scanner op;
    public static void main(String[] args) {
        op = new Scanner(System.in);
        System.out.println("¿Cuántos pentagonos regulares quiere crear?");
        int n = op.nextInt();
        Pentagono[] pentagonos= new Pentagono[n];
        for (int i=0;i<n;i++){
            System.out.println("Digite el lado del pentagono "+(i+1)+":");
            double lado= op.nextDouble();
            pentagonos[i]=new Pentagono(lado,i);
        }
        for (int i=0;i<n;i++){
            pentagonos[i].MostrarPentagonos();
        }
    }
}
