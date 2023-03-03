/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_gerardocano;

/**
 *
 * @author gcano
 */
public class Singles extends Lanzamientos {
    private Cancion single;

    public Singles() {
    super();
    }

    public Singles(Cancion single, String titulo, String fecha, int conteo) {
        super(titulo, fecha, conteo);
        this.single = single;
    }

    public Cancion getSingle() {
        return single;
    }

    public void setSingle(Cancion single) {
        this.single = single;
    }

    @Override
    public String toString() {
        return super.toString()+ single; 
    }
    
  
    
}
