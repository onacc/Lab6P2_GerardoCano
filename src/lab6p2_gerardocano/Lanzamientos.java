/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_gerardocano;

/**
 *
 * @author gcano
 */
public class Lanzamientos {
    protected String titulo ,fecha;
    protected int conteo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }

    public Lanzamientos() {
    }

    public Lanzamientos(String titulo, String fecha, int conteo) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.conteo = conteo;
    }

    @Override
    public String toString() {
        return   titulo  + fecha + "Likes" + conteo ;
    }
    
}
