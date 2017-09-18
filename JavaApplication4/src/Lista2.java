/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class Lista2 {
    private Nodo2 head;
    private int size;
    
    public Lista2(Nodo2 head, int size) {
        this.head = null;
        this.size = 0;
    }
    public void addFirst(Object o){
        if(head==null)
            head=new Nodo2(o);
        else{
            Nodo2 a=head;
            Nodo2 b=new Nodo2(o);
            head=b;
            head.siguiente(a);
        }
        size++;
    }
    public void getsize(){
        System.out.println("El tamaño de la lista es "+size);
    }
    public void inicio(){
        this.head = null;
        this.size = 0;
    }
    public void removeall(){
        inicio();
    }
    public void removeFirst(){
        head = head.getSiguiente(); 
        size--; 
    }
    public int remove(int posicion) {
        if (posicion > size) { 
            System.out.println("No existe esa posicion");
        }
        if (posicion == 0) { 
            removeFirst();
            return posicion;
        } 
        else {
            int contador = 0; 
            Nodo2 a = head; 
            while (contador < posicion - 1) {
                a = a.getSiguiente(); 
                contador++;
            }
            a.setSiguiente(a.getSiguiente().getSiguiente());
            size--; 
        }
        return posicion; 
    }
        public Object getElemento(int posicion) {
        if (posicion > size) { 
            System.out.println("No existe esa posicion");
        }
        int cont = 0; 
        Nodo2 a = head; 

        while (cont < posicion) {
            a = a.getSiguiente(); 
            cont++; 
        }

        return a;
    }    
}
