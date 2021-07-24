package co.edu.utp.misiontic2022.c2.Ejercicio12_4_b;

public class Triangulo {
    private int base;
    private int altura;
    private double area;
    private int num;


    public Triangulo(int bas,int alt,int i){
        base=bas;
        altura=alt;
        area=(double) ((bas*alt)/2);
        num=i;
    }

    public void MostrarTriangulo(){
        System.out.println("\nTriangulo "+num+"\n\nAltura: "+altura+"\nBase: "+base+"\nÁrea: "+area+"\n");
    }
}
