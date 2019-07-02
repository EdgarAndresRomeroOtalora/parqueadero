/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ANDRES ROMERO
 */
public class Vehiculo implements Serializable{

    private String placa;
    private Date fechaIngreso;
    private Date fechaSalida;
    private int numParqueadero;
    private int costoParqueo;

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public Vehiculo(String placa, Date fechaIngreso, int numParqueadero) {
        this.placa = placa;
        this.fechaIngreso = fechaIngreso;
        this.numParqueadero = numParqueadero;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Vehiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumParqueadero() {
        return numParqueadero;
    }

    public void setNumParqueadero(int numParqueadero) {
        this.numParqueadero = numParqueadero;
    }

    public int getCostoParqueo() {
        return costoParqueo;
    }

    public void setCostoParqueo(int costoParqueo) {
        this.costoParqueo = costoParqueo;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String fechaSal= formato.format(fechaSalida);
        String horaSalida=formatoHora.format(fechaSalida);
        return "el vehiculo de placa "+placa+" salio el "+fechaSal+" a las "+horaSalida+" y pago "+costoParqueo+" pesos";
    }
    
    

}
