package controlador;

import java.io.Serializable;
import modelo.Vehiculo;

/**
 *
 * @author Vinni
 */
public class Nodo implements Serializable {

    private Vehiculo valor;
    private Nodo siguiente;

    public Nodo(Vehiculo valor) {
        this.valor = valor;
        siguiente = null;
    }

    public Nodo() {
    }

    public Vehiculo getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setValor(Vehiculo valor) {
        this.valor = valor;
    }

}
