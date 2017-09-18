
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class Lista {
    private Nodos head;
    private int size;

    public Lista() {
        size=0;
        head=null;
    }
    private void inicio(){
        this.head = null; // iniciamos la lista vacía
        this.size = 0; //indica que esta vacia la lista
    }
    
    public void addFirst(Object o){
        if(head==null)
            head=new Nodos(o);
        else{
            Nodos a=head;
            Nodos b=new Nodos(o);
            head=b;
            head.siguiente(a);
        }
        size++;
    }
    public void removeFirst(){
        if (head==null)
            return;
        else{
           head.getValor();
           Nodos a=head.siguiente(head);
           head.setValor(a); 
        }    
        size--;
    }
    public void size(){
        System.out.println("El tamaño de la lista es="+size);
    }
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }  
    public Object obtenerElemento(int posicion) {
        if (posicion > size) { // si pasan una posicion mayor al tamaño de la lista, lanza excepción
            throw new ArrayIndexOutOfBoundsException("No existe la posición");
        }
        int contador = 0; //inicializo el contador en 0
        Nodos temporal = head; // cargo en un nodo temporal la cabeza de la lista para comenzar la iteracion
        while (contador < posicion) {
            temporal = temporal.getSiguiente(); // hara la iteracion hasta que
            contador++; //incremento mi contador
        }
        return temporal.getValor();
    }
    
    public int remove(int posicion) {
        if (posicion > size) { 
            throw new ArrayIndexOutOfBoundsException("No existe esa posicion");
        }
        if (posicion == 0) { //si me pasaron la primera posicion, remuevo la cabeza y para al siguiente
            removeFirst();
            return posicion;
        } 
        else {//si es alguna otra posicion, se reempleza ese enlace
            int contador = 0; //inicializo mi contador
            Nodos temporal = head; //paso la cabeza temporal para iterarlo

            while (contador < posicion - 1) {//me pongo una posicion antes del posicion que quiero eliminar para sustituir ese enlace
                temporal = temporal.getSiguiente(); //voy recorriendo mis elementos de la lista
                contador++; //incremento mi contador hasta llegar a mi elemento
            }
            temporal.setSiguiente(temporal.getSiguiente().getSiguiente());
            size--; //desminuyo el tamaño de mi lista
        }
        return posicion; //retorno la posicion que me dieron a eliminar
    }
    public void removeAll() {
        inicio();
    }
}    
    /*
    public static void main(String [] args){
        ArrayList<String> ponny=new ArrayList<>();
        ponny.add("Hola");
        ponny.add("Hola");
        ponny.add("Hola");
        for (String l:ponny){
            System.out.println(l);
        }
        HashMap<Integer,String> map=new HashMap<>();
    } */

