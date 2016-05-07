/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Utilidades.Plantilla;
import Vista.Simulador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Scarlett
 */
public class ControlSimulador implements ActionListener {

    private Simulador simulador;
    private Plantilla plantilla;

    public ControlSimulador(Simulador s) {
        this.simulador = s;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equalsIgnoreCase("Simular")) {

            Object object = plantilla.getArreglo();

           
              for(int i=1; i==simulador.getjTIntercambios();i++){
             
             
             }
             
        }
    }
}


