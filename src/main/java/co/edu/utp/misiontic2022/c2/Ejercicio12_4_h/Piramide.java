package co.edu.utp.misiontic2022.c2.Ejercicio12_4_h;

public class Piramide {
    private int base;
    private double ladobase;
    private double altura;
    private double apotema;
    private double aristas;
    private double area;
    private double perimetro;
    private int num;

    public Piramide(double ladobas, int bas,double alt,int i){
        base=bas;
        ladobase=ladobas;
        altura=alt;
        aristas=Math.sqrt(ladobase*ladobase+(altura*altura));
        double ap=Math.sqrt(ladobase*ladobase-((ladobase*ladobase)/4));
        apotema=Math.sqrt(altura*altura+(ap*ap));
        double areabase=base*ap*ladobase/2;
        double arealateral=base*apotema*ladobase/2;
        area=areabase+arealateral;
        num=i;
        perimetro=base*ladobase;
    }

    public void MostrarPiramide(){
        System.out.println("Piramide "+num+":\n"+"\nLado base= "+ladobase+"\nAltura = "+altura+"\nApotema = "+apotema+"\nArista = "+aristas+"\nÁrea = "+area+"\nPerímetro = "+perimetro);
    }
}