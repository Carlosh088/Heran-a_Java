/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3;

/**
 *
 * @author Carlos
 */
class Miseravel extends Pessoa{
    
    public Miseravel(String nome) {
        super(nome);
    }
    public void pedir(){
        System.out.println(nome + " está pedindo.");
}
    public void dever(){
        System.out.println(nome + " está devendo.");
}
}