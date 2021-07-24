package co.edu.utp.misiontic2022.c2.Ejercicio12_4_a;

import java.util.Scanner;

/**
Construir una Clase (y su programa Java respectivo) que permita crear Cuadrados y que muestre, apropiadamente, sus atributos, su área y su perímetro
 */
public class Main {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("¿Cuánto cuadrados quiere generar?");
        int n=op.nextInt();
        Cuadrado cuadrados[]=new Cuadrado[n];
        for (int i=0;i<n;i++){
            System.out.println("¿Cuánto mide el lado del cuadrado "+(i+1)+" ?");
            int lado=op.nextInt();
            cuadrados[i]= new Cuadrado(lado,(i+1));
        }
        for (int i=0;i<n;i++){
            cuadrados[i].MostrarCuadrado();
        }

    }
}
