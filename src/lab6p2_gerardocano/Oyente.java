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
public class Oyente extends Usuarios {
     private ArrayList<Playlist> creadas = new ArrayList();
     private ArrayList<Cancion> liked = new ArrayList();
     private ArrayList<Playlist> playliked = new ArrayList();

    public Oyente() {
    super();
    }

    public Oyente(String username, String password, int edad,String tipo) {
        super(username, password, edad);
    }
    
    public ArrayList<Playlist> getCreadas() {
        return creadas;
    }

    public void setCreadas(ArrayList<Playlist> creadas) {
        this.creadas = creadas;
    }

    public ArrayList<Cancion> getLiked() {
        return liked;
    }

    public void setLiked(ArrayList<Cancion> liked) {
        this.liked = liked;
    }

    public ArrayList<Playlist> getPlayliked() {
        return playliked;
    }

    public void setPlayliked(ArrayList<Playlist> playliked) {
        this.playliked = playliked;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
     
}
