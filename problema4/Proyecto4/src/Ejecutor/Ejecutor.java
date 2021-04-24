/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor;

import Celular.Celular;

/**
 *
 * @author USER
 */
public class Ejecutor {

    public static void main(String[] args) {
        Celular c = new Celular();
        String sistema = "Android";
        String tamaño = "720 x 1280";
        double costo = 600.50;
        String direccion = "d2:5c:dd:8d";
        int imei = 352121569;

        c.establecerSistema(sistema);
        c.establecerTamaño(tamaño);
        c.establecerCosto(costo);
        c.establecerDireccion(direccion);
        c.establecerImei(imei);

        System.out.printf("Informacion del Celular\n\n"
                + "Sistema operativo:%D\n"
                + "Tamaño de pantalla: %s\n"
                + "costo:%d\n"
                + "Dirección Mac:%d\n"
                + "Información IMEI.:%d\n",
                c.obtenerSistema(),
                c.obtenerTamaño(), c.obtenerCosto(),
                c.obtenerDireccion(), c.obtenerImei());
    }

}
