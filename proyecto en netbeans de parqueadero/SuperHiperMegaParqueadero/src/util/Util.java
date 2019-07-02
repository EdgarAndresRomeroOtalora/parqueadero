/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author kmi
 */
public class Util {

    public Object[][] setJTable(ArrayList<Object> lista) {
        Object[][] objetos = new Object[lista.size()][1];
        for (int i = 0; i < lista.size(); i++) {
            objetos[i][0] = lista.get(i);
        }
        return objetos;
    }

    
    public Object[] setJList(ArrayList<Object> lista) {
        Object[]objetos = new Object[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            objetos[i] = lista.get(i);
        }
        return objetos;
    }
    public void serializar(String nombreArchivo, Object objeto) {

        ObjectOutputStream escribiendoFichero = null;
        try {
            escribiendoFichero = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            escribiendoFichero.writeObject(objeto);
            escribiendoFichero.close();
        } catch (IOException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                escribiendoFichero.close();
            } catch (IOException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Object desSerializar(String nombreArchivo) {
        Object obj;
        ObjectInputStream leyendoFichero = null;
        try {
            leyendoFichero = new ObjectInputStream(new FileInputStream(nombreArchivo));
            obj = leyendoFichero.readObject();
            leyendoFichero.close();
            return obj;
        } catch (IOException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (leyendoFichero != null) {
                    leyendoFichero.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

}
