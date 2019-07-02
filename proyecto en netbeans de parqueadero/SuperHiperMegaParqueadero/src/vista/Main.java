/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import controlador.Lista;
import controlador.Nodo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import modelo.Vehiculo;

/**
 *
 * @author ANDRES ROMERO
 */
public class Main {
    
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        Lista listasencilla = new Lista();
        
        Vehiculo vehiculo=new Vehiculo("abc123", date, 5);
        Nodo nodo1=new Nodo(vehiculo);
        listasencilla.agregarAlFinal(nodo1);
        listasencilla.listar();
        
        Vehiculo vehiculo2=new Vehiculo("def123", date, 11);
        nodo1=new Nodo(vehiculo2);
        listasencilla.agregarAlFinal(nodo1);
        listasencilla.listar();
        
        Vehiculo vehiculo3=new Vehiculo("ghi123", date, 1);
        nodo1=new Nodo(vehiculo3);
        listasencilla.agregarAlFinal(nodo1);
        listasencilla.listar();
        
        Vehiculo vehiculo4=new Vehiculo("jkl123", date, 7);
        nodo1=new Nodo(vehiculo4);
        listasencilla.agregarAlFinal(nodo1);
        listasencilla.listar();
        
        for (int i = 0; i < listasencilla.vehiculosParqueados(nodo1).length; i++) {
            System.out.println(listasencilla.vehiculosParqueados(nodo1)[i]);
        }
        
        Vehiculo carro=listasencilla.crearObjetoSalida(nodo1);
        System.out.println(carro.getFechaIngreso()+carro.getPlaca());
        
        
        
        /*SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
       Controlador controlador=new Controlador();
       Date fechaInicial=formato.parse("2019-04-03-12-00-00");
       System.out.println(""+controlador.costoTotal(fechaInicial)); */
    }
}
