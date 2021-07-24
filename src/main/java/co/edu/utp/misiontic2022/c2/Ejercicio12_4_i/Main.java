package co.edu.utp.misiontic2022.c2.Ejercicio12_4_i;
import java.util.Scanner;

/**
Construir una Clase (y su programa Java respectivo) que permita crear
Cubos y que muestre, apropiadamente, sus atributos, su área y su
perímetro
 */
public class Main {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("¿Cuántos cubos quieres crear?");
        int num=op.nextInt();
        Cubo Cubos[]=new Cubo[num];
        for (int i=0;i<num;i++){
            System.out.println("¿Cuánto mide la arista del cubo "+(i+1)+" ?");
            double arista=op.nextDouble();
            Cubos[i]=new Cubo(arista,(i+1));
        }
        for (int i =0;i<num ;i++){
            Cubos[i].MostrarCubo();
        }
    }
}