/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforospuente;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Sala_02
 */
public class SemaforoB extends Semaforo {

    private boolean estado;
    public ArrayList<Vehiculo> colaVehiculosB = new ArrayList();

    public SemaforoB() {

    }

    public void activarSemaforo(SemaforoA s) {
        
        if (!s.semaforoVerde()) {
            setEstado(true);
        }
        
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Vehiculo> getColaVehiculosB() {
        return colaVehiculosB;
    }

    public void setColaVehiculosB(ArrayList<Vehiculo> colaVehiculosB) {
        this.colaVehiculosB = colaVehiculosB;
    }

}
