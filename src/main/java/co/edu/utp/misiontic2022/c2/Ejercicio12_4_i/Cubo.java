package co.edu.utp.misiontic2022.c2.Ejercicio12_4_i;

public class Cubo {
    private double area;
    private int caras;
    private double arista;
    private double volumen;
    private int num;

    public Cubo(double arist,int i){
        caras=6;
        area=arist*arist*caras;
        volumen= arist*arist*arist;
        arista=arist;
        num=i;
    }

    public void MostrarCubo(){
        System.out.println("Cubo "+num+":\n\nArista = "+arista+"\nÁrea = "+area+"\nVolumen = "+volumen+"\n");
    }
}
