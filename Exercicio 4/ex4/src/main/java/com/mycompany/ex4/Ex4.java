/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex4;
import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tipo de ingresso, 1 para comum e 2 para VIP: ");
        
        int tipo = scanner.nextInt();
        
        int tipo2 = 0;
        
        if(tipo == 1){
            System.out.println("Seu ingresso é comum.");
        }else if(tipo == 2){
            System.out.println("Digite 1 se deseja o camarote superior ou 2 para o camarote inferior");
        
        tipo2 = scanner.nextInt();
        }else{
            System.out.println("Número inválido tente novamente.");
        }
        
        Ingresso ingresso = new Ingresso(tipo, tipo2);
        
        if(tipo2 == 0){
        System.out.println("O valor do ingresso comum é de: R$30,00.");
    }else if(tipo2 == 2){
        System.out.println("Você escolheu camarote inferior, valor do ingresso: R$80,00");
        }else if(tipo2 == 1){
        System.out.println("Você escolheu o camarote superior, valor do ingresso: R$110,00");
        }else{
              System.out.println("Informações inválidas, tente novamente.");  
                }
    }
}


