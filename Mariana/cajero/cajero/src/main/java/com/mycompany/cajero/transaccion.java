/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajero;

/**
 *
 * @author desarrollo
 */
public abstract class Transaccion {
    
    
    Banco banco = new 
    
    public static float retiro(float saldo, float monto, int numCuenta, boolean acceso) {
        
        if (monto <= saldo && acceso == true ){
            
            while (monto != 0 ){
                
                monto-=10000;
               
                
            }
           
            }
            
        }else{
            System.out.println("Saldo Insuficiente");
            System.out.println("PIIIIIIIIIIIIIIII");
            
        }
        
        float nuevoSaldo= saldo- monto;
        return nuevoSaldo;
        
        public static void impriirRecibo(int numCuenta, String nombreBanco, float saldo, float monto){
        
            float nuevoSaldo = (saldo - monto);
            System.out.println("Banco"+ nombreBanco + "\n" + "Numero de cuenta: " + numCuenta + "\n" + "Numero de transaccion:" + idTransac + "\n" + "monto retiro" + monto + "\n") + "Nuevo saldo" + nuevoSaldo + "\n" + "validar" + retiro(saldo, monto, true) + "\n";
            
        }
    
    }
    
    public 
