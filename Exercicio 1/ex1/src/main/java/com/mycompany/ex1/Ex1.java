/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex1;

/**
 *
 * @author Carlos
 */
public class Ex1 {

    public static void main(String[] args) {
        AssistenteAdm Assistente = new AssistenteAdm("145", "Carlos");
        Tecnico tecnico = new Tecnico("218", "Luíza");
        
        Assistente.NomeMatricula();
        tecnico.NomeMatricula();
    }
}
