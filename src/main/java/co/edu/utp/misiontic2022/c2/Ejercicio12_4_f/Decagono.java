package co.edu.utp.misiontic2022.c2.Ejercicio12_4_f;

public class Decagono {
    private double lado;
    private double apotema;
    private double area;
    private double perimetro;
    private int num;

    public Decagono(double lad, int i){
        lado=lad;
        apotema= Math.sqrt(lado*lado-((lado*lado)/4));
        area=10*((apotema*lado)/2);
        perimetro=10*lado;
        num=i;
    }

    public void MostrarDecagono(){
        System.out.print("\nDecagono "+num+"\nLado: "+lado+"\nApotema: "+apotema+"\nÁrea: "+area+"\nPerímetro: "+perimetro+"\n\n");
    }
}
