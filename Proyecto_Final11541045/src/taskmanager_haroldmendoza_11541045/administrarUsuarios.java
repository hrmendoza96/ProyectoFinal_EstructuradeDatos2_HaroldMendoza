/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanager_haroldmendoza_11541045;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELLPC
 */
public class administrarUsuarios {
    private ArrayList<Usuario> listaUsuarios = new ArrayList();
    private File archivo = null;

    public administrarUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarUsuarios{" + "listaUsuarios=" + listaUsuarios + '}';
    }
    
    public void setPersona(Usuario p) {
        this.listaUsuarios.add(p);
    }

    //metodos de admin
    public void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuario t : listaUsuarios) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getContraseña() + ";");
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }

    }
    
    public void cargarArchivo(){
        Scanner sc = null; 
        listaUsuarios = new ArrayList(); 
        try {
            sc = new Scanner(archivo); 
            sc.useDelimiter(";");
            while(sc.hasNext()){
                listaUsuarios.add(new Usuario(sc.next(), sc.next()));            
            } // fin del while
        } catch (Exception e) {
        } finally{
            sc.close(); 
        }
    }
    
    
    
}
