/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.matiacornejoc.model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Matias
 */
public class Alquiler {

    public Alquiler(int aInt, LocalDateTime toLocalDateTime, int aInt1, String string, int aInt2, double aDouble) {
    }
    private Date fecha;
    private String ID_cliente;
    private String Patente_vehiculo;
    private int duracion_Alquiler;
    private Double Costo_total;

    public Alquiler() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(String ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public String getPatente_vehiculo() {
        return Patente_vehiculo;
    }

    public void setPatente_vehiculo(String Patente_vehiculo) {
        this.Patente_vehiculo = Patente_vehiculo;
    }

    public int getDuracion_Alquiler() {
        return duracion_Alquiler;
    }

    public void setDuracion_Alquiler(int duracion_Alquiler) {
        this.duracion_Alquiler = duracion_Alquiler;
    }

    public Double getCosto_total() {
        return Costo_total;
    }

    public void setCosto_total(Double Costo_total) {
        this.Costo_total = Costo_total;
    }
    
    
}
