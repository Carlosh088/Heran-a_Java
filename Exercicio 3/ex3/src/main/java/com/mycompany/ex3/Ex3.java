/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex3;

/**
 *
 * @author Carlos
 */
public class Ex3 {

    public static void main(String[] args) {
        Rica rica = new Rica("Alex");
        Pobre pobre = new Pobre ("Diego");
        Miseravel miserável = new Miseravel ("Pedro");
        
        rica.viajar();
        rica.investir();
        pobre.trabalhar();
        pobre.economizar();
        miserável.pedir();
        miserável.dever();
    }
}
