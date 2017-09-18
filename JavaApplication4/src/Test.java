/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class Test {
    public static void main(String [] u){
        Lista l=new Lista();
        Nodos n=new Nodos("3");
        l.addFirst("2");
        l.addFirst("4");
        l.addFirst("5");
        l.size();
        l.removeFirst();
        l.size();
        System.out.println(n.getValor());
    }
}
