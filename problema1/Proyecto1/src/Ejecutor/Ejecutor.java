/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor;

import proyecto1.Terreno;

/**
 *
 * @author USER
 */
public class Ejecutor {

    public static void main(String[] args) {
        Terreno t = new Terreno();

        double ancho = 153;
        double largo = 356;
        double valorMetroCuadrado = 100;

        t.establecerAncho(ancho);
        t.establecerLargo(largo);
        t.establecervalorMetroCuadrado(valorMetroCuadrado);
        t.calcularArea();
        t.calcularCosto();

        System.out.printf("Informacion del Terreno\n\nAncho:%.2f\nLargo: %.2f\n"
                + "Valor Metro Cuadrado:%.2f\nArea:%.2f\nCosto Total:%.2f\n",
                t.obtenerAncho(),
                t.obtenerLargo(), t.obtenervalorMetroCuadrado(),
                t.obtenerArea(), t.obtenerCosto());
    }
}
