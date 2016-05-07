/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Utilidades.Plantilla;
import Vista.AgregarDatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Scarlett
 */
public class ControlVistaPrincipal implements ActionListener{
    
    private AgregarDatos ad;
    private ControlAgregarDatos controlAgregarDatos;
   

    public ControlVistaPrincipal() {
       this.controlAgregarDatos=new ControlAgregarDatos();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equalsIgnoreCase("Agregar Datos")){
            ad =new AgregarDatos(controlAgregarDatos);
            controlAgregarDatos.setAgregarDatos(ad);
            ad.show();
        }if(ae.getActionCommand().equalsIgnoreCase("Simular")){
            
        }
        
    }
    
    
}
