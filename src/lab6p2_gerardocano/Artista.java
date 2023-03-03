/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_gerardocano;

import java.util.ArrayList;

/**
 *
 * @author gcano
 */
public class Artista extends Usuarios {
    private String nombreart;
    private ArrayList<Albumes> album = new ArrayList();
    private ArrayList<Singles> singles = new ArrayList();

    public Artista() {
    super();
    }
    
    public Artista(String nombreart, String username, String password, int edad,String tipo) {
        super(username, password, edad);
        this.nombreart = nombreart;
    }

    public String getNombreart() {
        return nombreart;
    }

    public void setNombreart(String nombreart) {
        this.nombreart = nombreart;
    }

    public ArrayList<Albumes> getAlbum() {
        return album;
    }

    public void setAlbum(ArrayList<Albumes> album) {
        this.album = album;
    }

    public ArrayList<Singles> getSingles() {
        return singles;
    }

    public void setSingles(ArrayList<Singles> singles) {
        this.singles = singles;
    }

    public Artista(String username, String password, int edad) {
        super(username, password, edad);
    }

    @Override
    public String toString() {
        return super.toString()+ nombreart ;
    }
    
    
}
