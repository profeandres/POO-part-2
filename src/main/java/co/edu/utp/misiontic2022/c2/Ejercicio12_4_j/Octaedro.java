package co.edu.utp.misiontic2022.c2.Ejercicio12_4_j;

public class Octaedro {
    private static final int CARAS=8;
    private static final int VERTICES=6;
    private static final int ARISTAS=12;
    private double arista;
    private double apotema;
    private double area;
    private double volumen;
    private int num;
    
    public Octaedro(double ari,int i){
        arista=ari;
        apotema= Math.sqrt(arista*arista-((arista*arista)/4));
        area=2*Math.sqrt(3)*apotema*apotema;
        volumen=(apotema*apotema*apotema*(Math.sqrt(2)))/3;
        num=i;
    }    

    public void MostrarOctaedro(){
        System.out.println("Octaedro "+num+" :\n\nAristas = "+ARISTAS+"\nCaras = "+CARAS+"\nVertices = "+VERTICES+"\nArista ="+arista+"\nApotema = "+apotema+"\nÁrea = "+area+"\nVolumen = "+volumen+"\n");
    }
}
