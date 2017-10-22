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
public class SemaforoA extends Semaforo{

    private boolean estado;
    public ArrayList<Vehiculo> colaVehiculosA = new ArrayList();
    
    public SemaforoA() {
       
    }

    public void activarSemaforo (){
        setEstado(true);
    }

    public boolean semaforoVerde(){
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Vehiculo> getColaVehiculosA() {
        return colaVehiculosA;
    }

    public void setColaVehiculosA(ArrayList<Vehiculo> colaVehiculosA) {
        this.colaVehiculosA = colaVehiculosA;
    }
    
    
    
}
