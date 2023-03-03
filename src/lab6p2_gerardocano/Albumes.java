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
public class Albumes extends Lanzamientos {
    private ArrayList<Cancion> canciones = new ArrayList();
    private int cont;

    public Albumes() {
    super();
    }

    public Albumes(int cont, String titulo, String fecha, int conteo) {
        super(titulo, fecha, conteo);
        this.cont = cont;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {
        return super.toString()+ canciones ;
    }
    
    
}
