/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.matiacornejoc.model;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Reportes {
     ArrayList<String> Vehiculo_alquilado = new ArrayList<>();
     ArrayList<String> filtro = new ArrayList<>();

    public ArrayList<String> getVehiculo_alquilado() {
        return Vehiculo_alquilado;
    }

    public void setVehiculo_alquilado(ArrayList<String> Vehiculo_alquilado) {
        this.Vehiculo_alquilado = Vehiculo_alquilado;
    }

    public ArrayList<String> getFiltro() {
        return filtro;
    }

    public void setFiltro(ArrayList<String> filtro) {
        this.filtro = filtro;
    } 
     
}
