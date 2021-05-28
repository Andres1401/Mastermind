/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MastermindCodigo;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Jesus Andres
 */
public class GeneradorDeCodigo {
    private ArrayList<Clavijas> codigoEsp;
    private ArrayList<Clavijas> codigoOculto;
    private Clavijas clave;
    private int negras;
    private int blancas;
    
    
    
    
    private GeneradorDeJugadas codigoOculto2;
    
    public GeneradorDeCodigo() {
        codigoEsp=new ArrayList<Clavijas>(36);
        //codigoEng=new ArrayList<Clavijas>(36);
        for(int i=0;i<36;i=i+6){
            //Creacion de clavijas que generaran el codigo oculto en español e ingles
        Clavijas clavija=new Clavijas("RO");
        Clavijas clavija1=new Clavijas("VE");
        Clavijas clavija2=new Clavijas("AM");
        Clavijas clavija3=new Clavijas("MA");
        Clavijas clavija4=new Clavijas("NA");
        Clavijas clavija5=new Clavijas("AZ");
        
        /*Clavijas clavija6=new Clavijas("RE");
        Clavijas clavija7=new Clavijas("GR");
        Clavijas clavija8=new Clavijas("YE");
        Clavijas clavija9=new Clavijas("MA");
        Clavijas clavija10=new Clavijas("OR");
        Clavijas clavija11=new Clavijas("BL");
*/
        // adicion de las clavijas creadad al array
        codigoEsp.add(clavija);
        codigoEsp.add(clavija1);
        codigoEsp.add(clavija2);
        codigoEsp.add(clavija3);
        codigoEsp.add(clavija4);
        codigoEsp.add(clavija5);
        
        /*codigoEng.add(clavija6);
        codigoEng.add(clavija7);
        codigoEng.add(clavija8);
        codigoEng.add(clavija9);
        codigoEng.add(clavija10);
        codigoEng.add(clavija11);
        */}
        Collections.shuffle(codigoEsp);
        //Collections.shuffle(codigoEng);
        
    }
   
    
    

    
    
    public GeneradorDeJugadas codigoOculto(int tamaño){
    if(tamaño==1){
    clave=codigoEsp.get(0);
    Clavijas Clavija1=clave;
    clave=codigoEsp.get(1);
    Clavijas Clavija2=clave;
    clave=codigoEsp.get(2);
    Clavijas Clavija3=clave;
    clave=codigoEsp.get(3);
    Clavijas Clavija4=clave;
    codigoOculto2=new GeneradorDeJugadas(Clavija1,Clavija2,Clavija3,Clavija4);
    }
    else {
     
    clave=codigoEsp.get(0);
    Clavijas Clavija1=clave;
    clave=codigoEsp.get(1);
    Clavijas Clavija2=clave;
    clave=codigoEsp.get(2);
    Clavijas Clavija3=clave;
    clave=codigoEsp.get(3);
    Clavijas Clavija4=clave;
    clave=codigoEsp.get(0);
    Clavijas Clavija5=clave;
    clave=codigoEsp.get(1);
    Clavijas Clavija6=clave;
    codigoOculto2=new GeneradorDeJugadas(Clavija1,Clavija2,Clavija3,Clavija4,Clavija5,Clavija6);
    }
    
    return codigoOculto2;}
    
    public int ContadorDeNegras(GeneradorDeJugadas codigoOculto,GeneradorDeJugadas partida,int juego){
    int black=0;
    if(juego==1){
    if((codigoOculto.getClavija1()).equals(partida.getClavija1()))
    black++;
    if((codigoOculto.getClavija2()).equals(partida.getClavija2()))
    black++;
    if((codigoOculto.getClavija3()).equals(partida.getClavija3()))
    black++;
    if((codigoOculto.getClavija4()).equals(partida.getClavija4()))
    black++;
    }
    else
    { 
    
    if((codigoOculto.getClavija1()).equals(partida.getClavija1()))
    black++;
    if((codigoOculto.getClavija2()).equals(partida.getClavija2()))
    black++;
    if((codigoOculto.getClavija3()).equals(partida.getClavija3()))
    black++;
    if((codigoOculto.getClavija4()).equals(partida.getClavija4()))
    black++;
    if((codigoOculto.getClavija5()).equals(partida.getClavija5()))
    black++;
    if((codigoOculto.getClavija6()).equals(partida.getClavija6()))
    black++;
    }
    return black;}
   
    
}
