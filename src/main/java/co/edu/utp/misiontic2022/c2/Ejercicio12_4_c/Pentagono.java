package co.edu.utp.misiontic2022.c2.Ejercicio12_4_c;

public class Pentagono {
    private double lado;
    private double apotema;
    private double perimetro;
    private double area;
    private int num;

    public Pentagono(double lad,int i){
        lado= lad;
        apotema=Math.sqrt(lad*lad-(lad*lad/4));
        perimetro= lad*5;
        area=5*((apotema*lado)/2);
        num=i;
    }
    
    public void MostrarPentagonos(){
        System.out.println("\nPentagono "+(num+1)+"\nLado = "+lado+"\nApotema = "+apotema+"\nPerimetro = "+perimetro+"\nÁrea ="+area+"\n");
    } 
}
