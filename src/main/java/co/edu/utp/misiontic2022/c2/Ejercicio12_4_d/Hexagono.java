package co.edu.utp.misiontic2022.c2.Ejercicio12_4_d;

public class Hexagono {
   private double lado;
   private double apotema;
   private double area;
   private double perimetro;
   private int num;

    public Hexagono(double lad,int i){
        lado=lad;
        apotema= Math.sqrt(lado*lado-((lado*lado)/4));
        area=6*(apotema*lado)/2;
        perimetro=6*lado;
        num=i;
   } 

   public void MostrarHexagono(){
       System.out.println("\nHexagono "+num+":"+"\nLado: "+lado+"\nApotema: "+apotema+"\nArea: "+area+"\nPerimetro: "+perimetro);
   }
}
