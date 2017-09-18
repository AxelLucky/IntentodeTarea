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
public class Programador {

    public final static String MOBILE="DESARROLLADOR MOVIL";
    public final static String BACK_END="DESARROLLADOR BACK-END";
    public final static String FRONT_END="DESARROLLADOR FRONT-END";
    public final static String DBA="DESARROLLADOR DE BASE DE DATOS";

    private String nombre;
    private String especialidad;

    public Programador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public static String getPuestoRandom(){
        Random r=new Random();
        String x[]={MOBILE,BACK_END,FRONT_END,DBA};
        return x[r.nextInt(x.length)];
    }
}
