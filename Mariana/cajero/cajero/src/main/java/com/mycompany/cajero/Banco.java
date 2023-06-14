/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajero;
 import java.util.Date;
/**
 *
 * @author desarrollo
 */
public class Banco {
    
    private int idBanco;
    private String entidadBanco;
    private String idTransac;
    private float monto;
    private Date fecha;

    public Banco(int idBanco, String entidadBanco, String idTransac, float monto, Date fecha) {
        this.idBanco = idBanco;
        this.entidadBanco = entidadBanco;
        this.idTransac = idTransac;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public String getEntidadBanco() {
        return entidadBanco;
    }

    public void setEntidadBanco(String entidadBanco) {
        this.entidadBanco = entidadBanco;
    }

    public String getIdTransac() {
        return idTransac;
    }

    public void setIdTransac(String idTransac) {
        this.idTransac = idTransac;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
