package co.edu.utp.misiontic2022.c2.Ejercicio12_4_g;

public class Dodecagono {
    
    private double lado;
    private double apotema;
    private double area;
    private double perimetro;
    private int num;

    public Dodecagono(double lad, int i){
        lado=lad;
        apotema=Math.sqrt(lado*lado-((lado*lado)/4));
        area=lado*lado*12;
        perimetro=lado*12;
        num=i;
    }

    public void MostrarDodecagono(){
        System.out.println("Dodecagono "+num+": "+"\n\nLado = "+lado+"\nApotema = "+apotema+"\nÁrea = "+area+"\nPerímetro = "+perimetro+ "\n\n");
    }
}
