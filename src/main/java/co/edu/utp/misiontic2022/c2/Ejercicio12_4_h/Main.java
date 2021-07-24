package co.edu.utp.misiontic2022.c2.Ejercicio12_4_h;
import java.util.Scanner;

/**
Construir una Clase (y su programa Java respectivo) que permita crear
Pirámides y que muestre, apropiadamente, sus atributos, su área y su
perímetro
 */
public class Main {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("¿Cuántas piramides quieres construir?");
        int num=op.nextInt();
        Piramide Piramides[]=new Piramide[num];
        for (int i=0;i<num;i++){
            System.out.println("¿Cuántos lados tiene la base de la piramide?");
            int bas=op.nextInt();
            System.out.println("¿Cuánto miden los lados de la base de la piramide?");
            double ladbase=op.nextInt();
            System.out.println("¿Cuánto mide la altura de la piramide?");
            double alt=op.nextDouble();
            Piramides[i]=new Piramide(ladbase, bas, alt, i);
        }
        for (int i=0;i<num;i++){
            Piramides[i].MostrarPiramide();
        }
    }
}