package co.edu.utp.misiontic2022.c2.Ejercicio12_4_g;
import java.util.Scanner;

/**
Construir una Clase (y su programa Java respectivo) que permita crear
Dodecágonos y que muestre, apropiadamente, sus atributos, su área y
su perímetro
 */
public class Main {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("¿Cuántos dodecagonos quieres crear?");
        int n=op.nextInt();
        Dodecagono Dodecagonos[]=new Dodecagono[n];
        for (int i=0;i<n;i++){
            System.out.println("Digite el tamaño del lado: ");
            double lado=op.nextDouble();
            Dodecagonos[i]=new Dodecagono(lado,(i+1));
        }
        for (int i=0;i<n;i++){
            Dodecagonos[i].MostrarDodecagono();
        }
    }
}