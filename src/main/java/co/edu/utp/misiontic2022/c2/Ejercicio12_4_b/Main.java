package co.edu.utp.misiontic2022.c2.Ejercicio12_4_b;
import java.util.Scanner;
/*
Construir una Clase (y su programa Java respectivo) que permita crear
Rectángulos y que muestre, apropiadamente, sus atributos, su área y su
perímetro
*/
public class Main {
    private static Scanner op;
    public static void main(String[] args) {
        op= new Scanner(System.in);
        System.out.println("¿Cuántos triángulos desea crear?");
        int n=op.nextInt();
        Triangulo[] Triangulos= new Triangulo[n]; 
        for (int i=0;i<n;i++){
            System.out.print("ingrese la base: ");
            int base=op.nextInt();
            System.out.print("ingrese la altura: ");
            int altura=op.nextInt();
            Triangulos[i]= new Triangulo(base,altura,(i+1));
        }
        for (int i=0;i<n;i++){
            Triangulos[i].MostrarTriangulo();
        }
    }
}