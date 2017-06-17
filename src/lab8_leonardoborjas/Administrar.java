/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_leonardoborjas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Leonardo Borjas
 */
public class Administrar {
    private File archivo=null;
    private ArrayList<Contacto> contactos= new ArrayList();
    private ArrayList<Mensaje> mensajes=new ArrayList();

    public Administrar() {
    }
    
    public Administrar(String path){
        this.archivo=new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "Administrar{" + "archivo=" + archivo + ", contactos=" + contactos + '}';
    }
    
    public void escribirArchivo(){
        FileOutputStream fw=null;
        ObjectOutputStream bw=null;
        try {
            fw = new FileOutputStream(archivo);
            bw=new ObjectOutputStream(fw);
            for (Contacto t : contactos) {
                bw.writeObject(t);
            }
            bw.writeObject("\n");
            for (Mensaje m : mensajes) {
                bw.writeObject(m);
            }
            bw.flush();
        } catch (Exception e) {
        }
        try {
            bw.close();
            fw.close(); 
        } catch (Exception e) {
        }
        
    }
}
