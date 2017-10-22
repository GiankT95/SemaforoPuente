/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforospuente;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Sala_02
 */
public class Vehiculo implements Runnable{
    
    private int velocidad;
    private int peso;
    private String posicion;
    
    public Vehiculo (int velocidad, int peso, String posicion){
        this.velocidad = velocidad;
        this.posicion = posicion;
        this.peso = peso;
    }

    @Override
    public void run() {
        
        
        
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    
    
}
