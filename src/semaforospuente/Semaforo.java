/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforospuente;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public abstract class Semaforo extends Thread{
    
    public ArrayList<Vehiculo> colaBloqueados = new ArrayList();
    
    
}
