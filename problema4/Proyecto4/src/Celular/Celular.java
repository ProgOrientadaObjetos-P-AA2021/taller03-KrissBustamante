/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Celular;

/**
 *
 * @author USER
 */
public class Celular {

    private String sistema;
    private String tamaño;
    private double costo;
    private String direccion;
    private int imei;

    public void establecerSistema(String c) {
        sistema = c;
    }

    public void establecerTamaño(String c) {
        tamaño = c;
    }

    public void establecerCosto(double c) {
        costo = c;
    }

    public void establecerDireccion(String c) {
        direccion = c;
    }

    public void establecerImei(int c) {
        imei = c;
    }

    public String obtenerSistema() {
        return sistema;
    }

    public String obtenerTamaño() {
        return tamaño;
    }

    public double obtenerCosto() {
        return costo;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public int obtenerImei() {
        return imei;
    }
}
