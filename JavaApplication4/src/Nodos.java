/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class Nodos {
    private Object valor;
    private Nodos siguiente;
    
    public Nodos(Object valor){
        this.valor=valor;
        this.siguiente=null;
    }
    public Nodos siguiente(Nodos n){
        this.siguiente=n;
        return this.siguiente;
    }

    public Nodos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodos n) {
        this.siguiente = n;
    }
    
    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
    
}
