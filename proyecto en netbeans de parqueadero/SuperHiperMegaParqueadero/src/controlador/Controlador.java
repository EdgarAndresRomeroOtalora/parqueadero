/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Vehiculo;
import vista.VIngreso;
import vista.Vparqueadero;

/**
 *
 * @author ANDRES ROMERO
 */
public class Controlador implements Serializable{
    public int costoTotal(Date fechaIngreso) throws ParseException{
        Date fechaFinal= new Date();
        int minutos=(int) ((fechaFinal.getTime()-fechaIngreso.getTime())/(1000*60));
        int costo=minutos*45;
        JOptionPane.showMessageDialog(null, "el vehiculo duro parqueado: "+minutos+" minutos y el costo de parqueo es: "+costo+" pesos");
        return costo;
    }
    
    public Vehiculo guardarObjeto(String placa, int numParqueadero){
        Date date=new Date();
        Vehiculo vehiculo=new Vehiculo(placa, date, numParqueadero);
        return vehiculo;
    }
    
    public boolean horarioFueraDeServicio() {
        //79200 10pm   21600 6am
        Date date = new Date();

        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String hora = formatoHora.format(date);

        String[] division = hora.split(":");
        int horas = Integer.valueOf(division[0]);
        int minutos = Integer.valueOf(division[1]);
        int segundos = Integer.valueOf(division[2]);
        int totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos;

        
         if(totalSegundos>21600&&totalSegundos<79200){
         
             return true;
         }else{
         
         return false;
         }
         
    }
}
