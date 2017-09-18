/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.util.Random;

/**
 *
 * @author Propietario
 */
public class Datos {
    public static void main (String [] args){
        int n;
        Random r=new Random();
        n=r.nextInt(1+2);   
        System.out.println(n);
    }
}