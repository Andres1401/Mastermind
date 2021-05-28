/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MastermindCodigo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Jesus Andres
 */
public class GeneradorDeJugadas {
    
    
    private String color;
    private Clavijas Clavija1;
    private Clavijas Clavija2;
    private Clavijas Clavija3;
    private Clavijas Clavija4;
    private Clavijas Clavija5;
    private Clavijas Clavija6;
    
    
    private ArrayList<Clavijas> jugada;
    Scanner sc = new Scanner(System.in);
    

    public GeneradorDeJugadas(Clavijas Clavija1, Clavijas Clavija2, Clavijas Clavija3, Clavijas Clavija4) {
        this.Clavija1 = Clavija1;
        this.Clavija2 = Clavija2;
        this.Clavija3 = Clavija3;
        this.Clavija4 = Clavija4;
    }
    
    
    

    public GeneradorDeJugadas(Clavijas Clavija1, Clavijas Clavija2, Clavijas Clavija3, Clavijas Clavija4, Clavijas Clavija5, Clavijas Clavija6) {
        this.Clavija1 = Clavija1;
        this.Clavija2 = Clavija2;
        this.Clavija3 = Clavija3;
        this.Clavija4 = Clavija4;
        this.Clavija5 = Clavija5;
        this.Clavija6 = Clavija6;
    }
    
    
    
    
    public GeneradorDeJugadas(int tamaño) {
        if(tamaño==1){
            
        
        System.out.println("\nIngrese el color de la casilla numero 1: ");
            color = sc.nextLine();
        Clavija1=new Clavijas(color);
  
        System.out.println("\nIngrese el color de la casilla numero 2: ");
            color = sc.nextLine();
        Clavija2=new Clavijas(color);
        
        System.out.println("\nIngrese el color de la casilla numero 3: ");
            color = sc.nextLine();
        Clavija3=new Clavijas(color);
        
        System.out.println("\nIngrese el color de la casilla numero 4: ");
            color = sc.nextLine();
        Clavija4=new Clavijas(color);}
        
        else {
        
        System.out.println("\nIngrese el color de la casilla numero 1 : ");
            color = sc.nextLine();
        Clavija1=new Clavijas(color);
        
        System.out.println("\nIngrese el color de la casilla numero 2 : ");
            color = sc.nextLine();
        Clavija2=new Clavijas(color);
        
        System.out.println("\nIngrese el color de la casilla numero 3 : ");
            color = sc.nextLine();
        Clavija3=new Clavijas(color);
        
        System.out.println("\nIngrese el color de la casilla numero 4 : ");
            color = sc.nextLine();
        Clavija4=new Clavijas(color);
        
        System.out.println("\nIngrese el color de la casilla numero 5 : ");
            color = sc.nextLine();
        Clavija5=new Clavijas(color);
        
        System.out.println("\nIngrese el color de la casilla numero 6 : ");
            color = sc.nextLine();
        Clavija6=new Clavijas(color);}
             
        }
        
          
    
    // Metodo que imprime los colores de la jugada
    public void MostrarJugada(ArrayList<Clavijas> jugada){
        System.out.println("\n"+jugada);
    }
        //Metodo que convierte la entrada de colores en un ArrayList
    public ArrayList<Clavijas> jugada(int tamaño){
        if(tamaño==1){
        jugada=new ArrayList<Clavijas>(4);
        
        jugada.add(Clavija1);
        jugada.add(Clavija2);
        jugada.add(Clavija3);
        jugada.add(Clavija4);}
        else {
        jugada=new ArrayList<Clavijas>(6);
        
        jugada.add(Clavija1);
        jugada.add(Clavija2);
        jugada.add(Clavija3);
        jugada.add(Clavija4);
        jugada.add(Clavija5);
        jugada.add(Clavija6);
        }
    return jugada;}


    public String Colores4(int negro) {
        return "\n" + Clavija1 + " " +Clavija2 + " " + Clavija3 + " " + Clavija4+" Negro "+negro+" clavos";
    }

    
    public String Colores6() {
        return "\n" + Clavija1 + " " + Clavija2 + " " + Clavija3 + " " + Clavija4 + " " + Clavija5 + " " + Clavija6 ;
    }
        
    public int ContadorDeNegras(GeneradorDeJugadas codigoOculto,int juego){
    int negras=0;
    if(juego==1){
    if((codigoOculto.getClavija1()).equals(Clavija1))
    negras++;
    if((codigoOculto.getClavija2()).equals(Clavija2))
    negras++;
    if((codigoOculto.getClavija3()).equals(Clavija3))
    negras++;
    if((codigoOculto.getClavija4()).equals(Clavija4))
    negras++;
    }
    else
    { 
    if(juego==1){
    if((codigoOculto.getClavija1()).equals(Clavija1))
    negras++;
    if((codigoOculto.getClavija2()).equals(Clavija2))
    negras++;
    if((codigoOculto.getClavija3()).equals(Clavija3))
    negras++;
    if((codigoOculto.getClavija4()).equals(Clavija4))
    negras++;
    if((codigoOculto.getClavija5()).equals(Clavija5))
    negras++;
    if((codigoOculto.getClavija6()).equals(Clavija6))
    negras++;
    }}
    return negras;}
    
    public String getClavija1(){return Clavija1.getColor();}
    public String getClavija2(){return Clavija2.getColor();}
    public String getClavija3(){return Clavija3.getColor();}
    public String getClavija4(){return Clavija4.getColor();}
    public String getClavija5(){return Clavija5.getColor();}
    public String getClavija6(){return Clavija6.getColor();}

    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.Clavija1);
        hash = 19 * hash + Objects.hashCode(this.Clavija2);
        hash = 19 * hash + Objects.hashCode(this.Clavija3);
        hash = 19 * hash + Objects.hashCode(this.Clavija4);
        hash = 19 * hash + Objects.hashCode(this.Clavija5);
        hash = 19 * hash + Objects.hashCode(this.Clavija6);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GeneradorDeJugadas other = (GeneradorDeJugadas) obj;
        if (!Objects.equals(this.Clavija1, other.Clavija1)) {
            return false;
        }
        if (!Objects.equals(this.Clavija2, other.Clavija2)) {
            return false;
        }
        if (!Objects.equals(this.Clavija3, other.Clavija3)) {
            return false;
        }
        if (!Objects.equals(this.Clavija4, other.Clavija4)) {
            return false;
        }
        if (!Objects.equals(this.Clavija5, other.Clavija5)) {
            return false;
        }
        if (!Objects.equals(this.Clavija6, other.Clavija6)) {
            return false;
        }
        return true;
    }
    
   
    
    
    
    
    
}
