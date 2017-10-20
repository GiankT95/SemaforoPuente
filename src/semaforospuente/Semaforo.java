/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforospuente;

import java.util.ArrayList;

/**
 *
 * @author Sala_02
 */
public abstract class Semaforo extends Thread{
    
    private boolean estado;
    private String posicion;
    public ArrayList<Vehiculo> colaVehiculos = new ArrayList();
    
    public abstract void agregarVehiculo(Vehiculo v);
    
}
