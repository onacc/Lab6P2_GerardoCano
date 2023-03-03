/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_gerardocano;

/**
 *
 * @author gcano
 */
public class Cancion {
    private String titulo,duracion,ref;

    public Cancion(String titulo, String duracion, String ref) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.ref = ref;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return   titulo  + duracion + ref;
    }
    
}
