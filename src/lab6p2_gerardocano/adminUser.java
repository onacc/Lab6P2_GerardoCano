/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_gerardocano;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gcano
 */
public class adminUser {
    private ArrayList<Usuarios> lista = new ArrayList();
    
    private File archivo = null;

    public ArrayList<Usuarios> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Usuarios> lista) {
        this.lista = lista;
    }
     public adminUser(String path) {
        archivo = new File(path);
    }
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void escribirArchivo() throws IOException {//del RAM al ROM
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Usuarios t : lista) {
                bw.write(t.getUsername() + ";");
                bw.write(t.getEdad() + ";");
                bw.write(t.getPassword() + ";");
                bw.write(t.getTipo()+ ";");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        lista = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    lista.add(new Usuarios(sc.next(),
                                    sc.next(),
                                    sc.nextInt()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
