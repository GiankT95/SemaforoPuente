/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforospuente;

import java.util.Random;

/**
 *
 * @author Asus
 */
public class Puente {
    
    public SemaforoA semA;
    public SemaforoB semB;
    
    public Puente (){
        semA = new SemaforoA();
        semB = new SemaforoB();
        
    }
    
    public void vehiculoAleatorio(){
        
        Random rnd = new Random();
        
        int v = (int) ((rnd.nextDouble() * 40) + 10);
        int p = (int) ((rnd.nextDouble() * 550) + 250);
        int pos = (int) (rnd.nextDouble()*2);
        
        if(pos == 0){
            Vehiculo vehiculo = new Vehiculo(v, p, "A");
            semA.colaVehiculosA.add(vehiculo);
        }
        else if (pos == 1){
            Vehiculo vehiculo = new Vehiculo(v, p, "B");
            semB.colaVehiculosB.add(vehiculo);
        }
        
    }
    
    
    
}
