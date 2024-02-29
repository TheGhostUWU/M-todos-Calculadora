/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author 97114
 */
public class Calculadora {

    public static void main(String[] args) {
        Operaciones op=new Operaciones();
        op.leeNumero();
        op.sumar();
        op.resta();
        op.multiplicacion();
        op.Division();
        op.mostrarResultado();
        
    }
}
