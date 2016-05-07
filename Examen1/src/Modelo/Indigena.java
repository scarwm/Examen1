/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Factory.Persona;

/**
 *
 * @author Scarlett
 */
public class Indigena implements Persona {
    private String Tipo;
    private String origen;
    private String paisActual;
    private String identidad;
    private int cantidadDeDias;

    public Indigena(String Tipo, String origen, String paisActual, String identidad) {
        this.Tipo = Tipo;
        this.origen = origen;
        this.paisActual = paisActual;
        this.identidad = identidad;
    }

    

    public Indigena() {
    }

    
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getPaisActual() {
        return paisActual;
    }

    public void setPaisActual(String paisActual) {
        this.paisActual = paisActual;
    }

    @Override
    public int asignarCantidadDeDias() {
         this.cantidadDeDias=-1;
       int cantidad=cantidadDeDias;
        return cantidad;
    }
    
}
