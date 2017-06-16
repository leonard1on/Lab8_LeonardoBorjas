/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_leonardoborjas;

import java.util.ArrayList;

/**
 *
 * @author Leonardo Borjas
 */
public class Contacto {
    private String nombre;
    private int edad;
    private int telefono;
    private String correo;
    private String direccion;
    private ArrayList<Mensaje> buzon=new ArrayList();
    private String genero;
    

    public Contacto() {
    }

    public Contacto(String nombre, int edad, int telefono, String correo, String direccion, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.genero=genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Mensaje> getBuzon() {
        return buzon;
    }

    public void setBuzon(ArrayList<Mensaje> buzon) {
        this.buzon = buzon;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
