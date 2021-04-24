/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor;

import EquivalenteHora.EquivalenteHora;
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EquivalenteHora eq = new EquivalenteHora();
        
       
       double horas = 11;
       
       
      eq.establecerHoras(horas);
      eq.calcularMinutos();
      eq.calcularSegundos();
      eq.calcularDias();
      
       System.out.printf("Equivalente de hora\n\nHoras:%.2f\nMinutos: %.2f\n"
                + "Segundos:%.2f\nDias:%.2f\nCosto Total:%.2f\n",
                eq.obtenerHoras(),eq.obtenerMinutos(),
                eq.obtenerSegundos(),eq.obtenerDias());  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
