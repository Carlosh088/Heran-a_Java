/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3;

/**
 *
 * @author Carlos
 */
class Pobre extends Pessoa{
    
    public Pobre(String nome) {
        super(nome);
    }
    public void trabalhar(){
        System.out.println(nome + " está trabalhando.");
    }
    public void economizar(){
        System.out.println(nome + " está economizando parte do seu salário.");
}
}
