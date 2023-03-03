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
public class Playlist {
    private String title;
    private ArrayList<Cancion> lista = new ArrayList();
    private int conteo;

    public Playlist(String title, int conteo) {
        this.title = title;
        this.conteo = conteo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Cancion> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cancion> lista) {
        this.lista = lista;
    }

    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }

    @Override
    public String toString() {
        return title;
    }
    
}
