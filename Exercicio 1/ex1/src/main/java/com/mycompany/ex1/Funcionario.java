/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author Carlos
 */
public class Funcionario {
    
    private String matrícula;
    private String nome;
    
    public Funcionario(String matrícula, String nome){
    this.matrícula = matrícula;
    this.nome = nome;
    }
    public void NomeMatricula(){
        System.out.println("Nome: " + nome + " Matrícula: " + matrícula);
    }
}
