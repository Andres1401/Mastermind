/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MastermindCodigo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Jesus Andres
 */
public class Mastermind {
//private static GeneradorDeCodigo codigo;

//private static GeneradorDeJugadas jugadas;
static int negra;
 



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<GeneradorDeJugadas> arrayJugada = new HashSet<>();
        arrayJugada.clear();
        ArrayList<Integer> negras=new ArrayList<Integer>(12);
        GeneradorDeCodigo codigo=new GeneradorDeCodigo();
        
        
        int modo=modoJuego();
        GeneradorDeJugadas codeO=codigo.codigoOculto(modo);
        switch(modo){
            
                    case 1:
                        System.out.println("Los colores posibles son:"
                                + "\n RO = Rojo"
                                + "\n VE = Verde"
                                + "\n AM = Amarillo"
                                + "\n MA = Magenta"
                                + "\n NA = Naranja"
                                + "\n AZ = Azul"
                                + "\n Procure utilizar el par de "
                                + "letras mayusculas para que el juego sea "
                                + "registrado");
                        
                        
                        for(int b=1;b<=12;b++){
                        int sel=0;
                        
                        GeneradorDeJugadas game=new GeneradorDeJugadas(1);
                        if(arrayJugada.equals(game)){
                            System.out.println("\nEl codigo ingresado no es "
                                    + "valido ya que se uso anteriormente "
                                    + "\nPor favor ingrese un codigo nuevo ");
                            sel=1;
                            b--;
                            }
                        else {
                            arrayJugada.add(game); 
                            GeneradorDeCodigo selec=new GeneradorDeCodigo();
                        negra=selec.ContadorDeNegras(codeO,game,1);
                        negras.add(negra);
                        
                            
            }
                        
                        if(sel==0){
                            //jugada=juego.jugada(1);
                            if(negra==4){
                                int puntos=120-(b*10);
                                System.out.println("Felicidades usted logro descubrir el codigo en el intento numero "+b+"\n"
                                        + "Obtuvo: "+puntos+" puntos"
                                +"\nEl codigo oculto es\n"+codeO);
                                b=12;
                                
                                for(GeneradorDeJugadas per: arrayJugada){
                                  System.out.println(per.getClavija1()+" "+per.getClavija2()+" "+per.getClavija3()+" "+per.getClavija4()+" "+negras+" negras"+"\n");}
                            }
                            else {
                             System.out.println("\nEl codigo ingresado no es el correcto, le quedan: "+(12-b)+" turnos");
                             for(GeneradorDeJugadas per: arrayJugada){
                                  System.out.println(per.getClavija1()+" "+per.getClavija2()+" "+per.getClavija3()+" "+per.getClavija4()+" "+negras+" negras"+"\n");}
}
                        }}
                        
                        break;
                    case 2:
                        System.out.println("Los colores posibles son:"
                                + "\n RO = Rojo"
                                + "\n VE = Verde"
                                + "\n AM = Amarillo"
                                + "\n MA = Magenta"
                                + "\n NA = Naranja"
                                + "\n AZ = Azul"
                                + "\n Procure utilizar el par de "
                                + "letras mayusculas para que el juego sea "
                                + "registrado");
                        
                        
                        for(int b=1;b<=12;b++){
                        int sel=0;
                        
                        GeneradorDeJugadas game=new GeneradorDeJugadas(2);
                        if(arrayJugada.equals(game)){
                            System.out.println("\nEl codigo ingresado no es "
                                    + "valido ya que se uso anteriormente "
                                    + "\nPor favor ingrese un codigo nuevo ");
                            sel=1;
                            b--;
                            }
                        else {
                            arrayJugada.add(game); 
                            GeneradorDeCodigo selec=new GeneradorDeCodigo();
                        negra=selec.ContadorDeNegras(codeO,game,2);
                        negras.add(negra);
            }
                        if(sel==0){
                            //jugada=juego.jugada(1);
                            if(negra==6){
                                int puntos=120-(b*10);
                                System.out.println("Felicidades usted logro descubrir el codigo en el intento numero "+b+"\n"
                                        + "Obtuvo: "+puntos+" puntos"
                                +"\nEl codigo oculto es\n"+codeO);
                                b=12;
                                
                                
                                    
                                for(GeneradorDeJugadas per: arrayJugada){
                                  System.out.println(per.getClavija1()+" "+per.getClavija2()+" "+per.getClavija3()+" "+per.getClavija4()+" "+per.getClavija5()+" "+per.getClavija6()+" "+negras+" negras"+"\n");}
                            }
                            else {
                             System.out.println("\nEl codigo ingresado no es el correcto, le quedan: "+(12-b)+" turnos");
                             //System.out.println("\n"+arrayJugada+" "+negras+" tachuelas negras");
}                             for(GeneradorDeJugadas per: arrayJugada){
                                  System.out.println(per.getClavija1()+" "+per.getClavija2()+" "+per.getClavija3()+" "+per.getClavija4()+" "+per.getClavija5()+" "+per.getClavija6()+" "+negras+" negras"+"\n");}

                        }}
                        break;
        }    
        
    //System.out.println("\nCodigo oculto\n"+codeO+""
            //+ "\n Felicidades, logro decifrar el codigo");
    
}
    
    public static int modoJuego(){
    int modo=0;
    System.out.println("Bienvenido al juego Mastermind");
    boolean valido;
    do{
    System.out.println("\nSeleccione el modo de juego "
                + "\n1. 4 espacios"
                + "\n2. 6 espacios");
        
        Scanner sc = new Scanner(System.in);
        modo = sc.nextInt();
        if(modo==1 || modo==2)
            valido=true;
        else {
            valido=false;
            System.out.println("\nLa opcion seleccionada no es valida, "
                    + "por favor ingrese un valor valido");
        }
    }
    while(!valido);
    return modo;}
    
    
}
