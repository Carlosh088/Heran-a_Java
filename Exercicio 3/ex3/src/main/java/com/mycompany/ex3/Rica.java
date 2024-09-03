/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3;

/**
 *
 * @author Carlos
 */
class Rica extends Pessoa{
    
    public Rica(String nome) {
        super(nome);
    }
    public void viajar(){
        System.out.println(nome + " está viajando.");
    }
    public void investir(){
        System.out.println(nome + " está investindo.");
    }
}
