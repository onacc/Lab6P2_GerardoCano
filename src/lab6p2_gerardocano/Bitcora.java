/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_gerardocano;

/**
 *
 * @author gcano
 */
public class Bitcora {
    private String date, user, tipo;

    public Bitcora(String date, String user, String tipo) {
        this.date = date;
        this.user = user;
        this.tipo = tipo;
    }

    public Bitcora() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return user;
    }
    
}
