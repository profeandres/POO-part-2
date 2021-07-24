package co.edu.utp.misiontic2022.c2.Ejercicio12_4_a;

public class Cuadrado {
    int lado;
    int perimetro;
    int area;
    int num;

    public Cuadrado(int lad,int i){
        lado=lad;
        perimetro=4*lad;
        area=lad*lad;
        num=i;
    }

    public void MostrarCuadrado(){
        System.out.println("\nCuadrado "+num+"\n\nLado: "+lado+"\nPerimetro: "+perimetro+"\nÁrea: "+area+"\n");
    }

}