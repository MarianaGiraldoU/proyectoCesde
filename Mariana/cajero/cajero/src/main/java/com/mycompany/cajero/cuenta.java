/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajero;

/**
 *
 * @author desarrollo
 */
public class cuenta  extends Banco{
// super va para integrar el contructor de las otras clases pero solo despues del public
    public cuenta(int id_cuenta, float saldo, String tipoCuenta) {
        super();
        this.id_cuenta = id_cuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
   
    private int id_cuenta;
    private float saldo;
    private String tipoCuenta;
    
}
