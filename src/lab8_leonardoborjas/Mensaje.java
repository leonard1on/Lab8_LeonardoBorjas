/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_leonardoborjas;

import java.util.Date;

/**
 *
 * @author Leonardo Borjas
 */
public class Mensaje {
    private Contacto emisor;
    private Contacto receptor;
    private String fecha;
    private String contenido;

    public Mensaje() {
    }

    public Mensaje(Contacto emisor, Contacto receptor, String fecha, String contenido) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha = fecha;
        this.contenido = contenido;
    }

    public Contacto getEmisor() {
        return emisor;
    }

    public void setEmisor(Contacto emisor) {
        this.emisor = emisor;
    }

    public Contacto getReceptor() {
        return receptor;
    }

    public void setReceptor(Contacto receptor) {
        this.receptor = receptor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "emisor=" + emisor + ", receptor=" + receptor + ", fecha=" + fecha + ", contenido=" + contenido + '}';
    }
    
    
}
