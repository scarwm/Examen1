/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Modelo.Ciudadano;
import Modelo.Indigena;
import Modelo.Migrante;
import Modelo.Refugiado;
import Vista.AgregarDatos;

/**
 *
 * @author Scarlett
 */
public class PatronFabrica {

    private AgregarDatos ad;
    private Persona personita;

    public Persona getPersona(String Tipo, String origen, String paisActual, String identidad) {

        String tipo = Tipo;

        if (tipo.equalsIgnoreCase("Ciudadano")) {
            personita = new Ciudadano(Tipo,origen, paisActual, identidad);
            
        } else if (tipo.equalsIgnoreCase("Refugiado")) {
            personita = new Refugiado(Tipo,origen, paisActual, identidad);

        } else if (tipo.equalsIgnoreCase("Indigena")) {
            personita = new Indigena(Tipo,origen, paisActual, identidad);

        } else if (tipo.equalsIgnoreCase("Migrante")) {
             personita=new Migrante(Tipo,origen, paisActual, identidad);

        }
        return personita;
    }

}
