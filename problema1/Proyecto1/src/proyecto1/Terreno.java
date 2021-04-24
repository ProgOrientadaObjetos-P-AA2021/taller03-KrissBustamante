/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author USER
 */
public class Terreno {

    private double costo;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public void establecerAncho(double c) {
        ancho = c;
    }

    public void establecerLargo(double c) {
        largo = c;
    }

    public void establecervalorMetroCuadrado(double c) {
        valorMetroCuadrado = c;
    }
//public void establecerArea()

    public void calcularArea() {
        area = ancho * largo;
    }
//public void establecerCosto()

    public void calcularCosto() {
        costo = area * valorMetroCuadrado;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenervalorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerCosto() {
        return costo;
    }
}
