/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Factory.PatronFabrica;
import Factory.Persona;
import Modelo.Pais;
import Utilidades.Plantilla;
import Vista.AgregarDatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Scarlett
 */
public class ControlAgregarDatos implements ActionListener {

    private AgregarDatos ad;
    private Plantilla<Persona> p;
    private Plantilla<Pais> pa;
    private PatronFabrica patronFabricaf;
    private ArrayList<String> arregloPaises;
    private Pais pais;

    public static final int AGREGARPAIS = 1;
    public static final int AGREGARPERSONA = 2;

    public ControlAgregarDatos() {
        
        p = new Plantilla<>();
        pa = new Plantilla<>();
        patronFabricaf =new PatronFabrica();
        this.arregloPaises=new ArrayList<String>();
    }

     public void setAgregarDatos(AgregarDatos agregar) {
        this.ad=agregar;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        int opcion = ad.getCodigoPorFuente(ae.getSource());
        if (opcion == 1) {
            pais=new Pais(ad.getjTNombrePais(),ad.getjTCantidadDePersonas());
            pa.agregar(pais);
            arregloPaises.add("Zona indigena");
            arregloPaises.add(ad.getjTNombrePais());
            ad.setJc();
        }
        if (opcion == 2) {
            
            p.agregar(patronFabricaf.getPersona(ad.getjCTipo(),ad.getjCPaisDeOrigen(),ad.getjCPaisActual(),ad.getjTIdentidad()));
        }

    }
    
    public ArrayList<String> getArreglo() {
        return arregloPaises;
    }

}
