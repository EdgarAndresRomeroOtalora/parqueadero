package controlador;

import java.io.Serializable;
import java.util.Scanner;
import javax.swing.JButton;
import modelo.Vehiculo;
import vista.VIngreso;
import static vista.VSalida.cbxPlacas;

/**
 *
 * @author Vinni
 */
public class Lista implements Serializable {

    private Nodo nodoPrincipal;
    String a = "";

    public Lista() {
        nodoPrincipal = null;
    }

    public boolean esVacia() {
        if (nodoPrincipal == null) {
            return true;
        }
        return false;
    }

    //OPERACIONES
    public void agregarAlFinal(Nodo valor) {
        if (esVacia()) {
            nodoPrincipal = valor;
        } else {
            Nodo aux = nodoPrincipal;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(valor);
        }

    }

    public boolean hayPlacaIgual(Nodo valor) {
        String igual = VIngreso.txtPlaca.getText();
        if (!esVacia()) {
            Nodo aux = nodoPrincipal;
            while (aux != null) {
                if (aux.getValor().getPlaca().equals(igual)) {
                    return true;
                }
                aux = aux.getSiguiente();
            }
        }
        return false;
    }

    public boolean parqueaderoOcupado(Nodo valor) {
        int parqueadero = 10;
        if (!esVacia()) {
            Nodo aux = nodoPrincipal;
            while (aux != null) {
                if (aux.getValor().getNumParqueadero() == parqueadero) {
                    return true;
                }
                aux = aux.getSiguiente();
            }
        }
        return false;
    }

    public int[] vehiculosParqueados(Nodo valor) {
        Nodo aux = nodoPrincipal;
        int contador = 0;
        while (aux != null) {
            contador = contador + 1;
            aux = aux.getSiguiente();
            
        }
        int[] carrosParqueados = new int[contador];
        
        if(!esVacia()){
            aux = nodoPrincipal;
            contador=0;
            while (aux != null) {
                carrosParqueados[contador]=aux.getValor().getNumParqueadero();
                contador=contador+1;
                aux=aux.getSiguiente();
            }
        }
        return carrosParqueados;
    }
    
    public String[] placasVehiculosParqueados(Nodo valor) {
        Nodo aux = nodoPrincipal;
        int contador = 0;
        while (aux != null) {
            contador = contador + 1;
            aux = aux.getSiguiente();
            
        }
        String[] carrosParqueados = new String[contador];
        
        if(!esVacia()){
            aux = nodoPrincipal;
            contador=0;
            while (aux != null) {
                carrosParqueados[contador]=aux.getValor().getPlaca();
                contador=contador+1;
                aux=aux.getSiguiente();
            }
        }
        return carrosParqueados;
    }

    public void borrarVehiculo(Nodo valor) {
        if (!esVacia()) {
            String borrar = "";
            //System.out.println("ingrese el numero del parqueadero del vehiculo que va a retirar");
            //Scanner entradaEscaner = new Scanner(System.in);
            //borrar = entradaEscaner.nextLine();
            borrar=cbxPlacas.getSelectedItem().toString();
            if (nodoPrincipal.getValor().getPlaca().equals(borrar)) {
                nodoPrincipal = nodoPrincipal.getSiguiente();
            } else {
                Nodo aux = nodoPrincipal;
                Nodo sig = nodoPrincipal;
                Nodo ultimo = nodoPrincipal;
                while (aux.getSiguiente() != null) {
                    aux = aux.getSiguiente();
                    if (aux.getSiguiente() == null) {
                        ultimo = aux;
                    }
                }
                if (ultimo.getValor().getPlaca().equals(borrar)) {
                    aux = nodoPrincipal;
                    Nodo penultimo = null;
                    while (aux.getSiguiente() != null) {
                        penultimo = aux;
                        aux = aux.getSiguiente();
                    }
                    aux = nodoPrincipal;
                    while (aux != penultimo) {
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(null);
                } else {
                    aux = nodoPrincipal;
                    while (aux.getSiguiente() != null) {
                        if (aux.getSiguiente().getValor().getPlaca().equals(borrar)) {
                            sig = aux.getSiguiente().getSiguiente();
                            aux.setSiguiente(sig);
                        }
                        aux = aux.getSiguiente();
                    }
                }
            }
        }
    }
    
    public Vehiculo crearObjetoSalida(Nodo valor){
        Vehiculo vehiculo=new Vehiculo();
        if (!esVacia()) {
            
            Nodo aux=nodoPrincipal;
            String placa="";
            /*System.out.println("ingrese el numero del parqueadero del vehiculo que va a retirar");
            Scanner entradaEscaner = new Scanner(System.in);
            placa = entradaEscaner.nextLine();*/
            placa=cbxPlacas.getSelectedItem().toString();
            while (aux != null) {
            if(aux.getValor().getPlaca().equals(placa)){
                vehiculo.setPlaca(aux.getValor().getPlaca());
                vehiculo.setFechaIngreso(aux.getValor().getFechaIngreso());
            }
            aux = aux.getSiguiente();
            
        }
        }
        
        return vehiculo;
    }

    public void listar() {
        System.out.println(" - - -- inicio - -");
        boolean fin = false;
        Nodo aux = nodoPrincipal;

        while (!fin) {
            if (aux != null) {
                System.out.println(" " + aux.getValor().getPlaca() + "  " + aux.getValor().getNumParqueadero());
                aux = aux.getSiguiente();
            } else {
                fin = true;
            }

        }
        System.out.println(" - - -- fin- -");

    }

}
