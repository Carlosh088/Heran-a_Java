/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author Carlos
 */
class Cachorro extends Animal{
    public void latir(){
        System.out.println("O cachorro está latindo.");
    }
    
    @Override
    public void caminhar(){
        System.out.println("O cachorro está caminhando.");
    }
}
