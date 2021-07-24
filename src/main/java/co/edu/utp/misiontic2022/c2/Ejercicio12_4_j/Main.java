package co.edu.utp.misiontic2022.c2.Ejercicio12_4_j;
import java.util.Scanner;

/**
Construir una Clase (y su programa Java respectivo) que permita crear
Octaedros y que muestre, apropiadamente, sus atributos, su área y su
perímetro
 */
public class Main {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("¿Cuántos octaedros quieres crear?");
        int num=op.nextInt();
        Octaedro Octaedros[]= new Octaedro[num];
        for(int i=0;i<num;i++){
            System.out.println("¿cuánto mide la arista del octaedro"+(i+1)+"?");
            double arista=op.nextDouble();
            Octaedros[i]=new Octaedro(arista,(i+1));
        }
        for (int i=0;i<num;i++){
            Octaedros[i].MostrarOctaedro();
        }
    }
}