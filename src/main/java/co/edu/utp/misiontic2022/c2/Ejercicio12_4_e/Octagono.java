package co.edu.utp.misiontic2022.c2.Ejercicio12_4_e;

public class Octagono {
    private double lado;
    private double apotema;
    private double area;
    private double perimetro;
    private int num;

    public Octagono(double lad,int i){
        lado=lad;
        apotema=Math.sqrt(lado*lado-((lado*lado)/4));
        area=8*((lado*apotema)/2);
        perimetro=8*lado;
        num=i;
    }

    public void MostrarOctagono(){
        System.out.println("\nOctagono "+num+":"+"\nLado ="+lado+"\nApotema = "+apotema+"\nÁrea = "+area+"\nPerimetro = "+perimetro+"\n");
    }
}
