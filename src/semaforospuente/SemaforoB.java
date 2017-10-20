/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforospuente;

/**
 *
 * @author Sala_02
 */
public class SemaforoB extends Semaforo{

    @Override
    public void agregarVehiculo(Vehiculo v) {
        this.colaVehiculos.add(v);
    }
    
}
