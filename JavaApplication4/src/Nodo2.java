/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class Nodo2 {
    private Object valor;
    private Nodo2 siguiente;
    private Nodo2 anterior;
    
    public Nodo2(Object valor){
        this.valor=valor;
        this.siguiente=null;
        this.anterior=null;
    }
    public Nodo2 siguiente(Nodo2 n){
        this.siguiente=n;
        return this.siguiente;
    }

    public Nodo2 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo2 n) {
        this.siguiente = n;
    }
    
    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Nodo2 getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo2 n) {
        this.anterior = n;
    }
    
}
