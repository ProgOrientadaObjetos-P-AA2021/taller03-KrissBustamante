/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor;

import Institucion.Institucion;

/**
 *
 * @author USER
 */
public class Ejecutor {

    public static void main(String[] args) {
        Institucion i = new Institucion();
        String nombre = "Eugenio Espejo";
        String tipo = "Privada";
        int alumnos = 456;
        int docentes = 40;
        int sedes = 2;

        i.establecerNombre(nombre);
        i.establecerTipo(tipo);
        i.establecerAlumnos(alumnos);
        i.establecerDocentes(docentes);
        i.establecerSedes(sedes);

        System.out.printf("Informacion de la Institucion\n\n"
                + "Nombre de la institucion:%s\n"
                + "Tipo de instituciOn: %s\n"
                + "Número de alumnos:%d\n"
                + "Número de docentes:%d\n"
                + "Número de sedes:%d\n",
                i.obtenerNombre(),
                i.obtenerTipo(), i.obtenerAlumnos(),
                i.obtenerDocentes(), i.obtenerSedes());
    }
}
