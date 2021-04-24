/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EquivalenteHora;

/**
 *
 * @author USER
 */
public class EquivalenteHora {
   private double horas;
   private double  minutos;
   private double  segundos;
   private double dias;
   
   
   public void establecerHoras(double c) {
       horas = c;
   }
   //public void establecerMinutos()
   public void calcularMinutos() {
minutos = horas *60;
   }
 //public void establecerSegundos()
   public void calcularSegundos() {
 segundos = minutos * 60;      
   }
    //public void establecerDias()
   public void calcularDias() {
       dias = horas/24;
   }
   public double obtenerHoras(){
   return horas;
   }
   public double obtenerMinutos(){
   return minutos;
   }
   public double obtenerSegundos(){
   return segundos;
   }
   public double obtenerDias(){
   return dias;
   }
}