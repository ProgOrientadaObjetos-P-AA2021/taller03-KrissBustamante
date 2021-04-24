/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Institucion;

/**
 *
 * @author USER
 */
public class Institucion {
    private String nombre;
    private String tipo;
    private int alumnos;
    private int docentes;
    private int sedes;
    
    public void establecerNombre(String c) {
       nombre = c;
   }
    public void establecerTipo(String c) {
       tipo = c;
   }
public void establecerAlumnos(int c) {
       alumnos = c;
   }    
   public void establecerDocentes(int c) {
       docentes = c;
   }
   public void establecerSedes(int c) {
       sedes = c;
   }
   public String obtenerNombre(){
   return nombre;
   }   
    public String obtenerTipo(){
   return tipo;
   } 
    public int obtenerAlumnos(){
   return alumnos;
   }
   public int obtenerDocentes(){
   return docentes;
   }
   public int obtenerSedes(){
   return sedes;
   }
}
