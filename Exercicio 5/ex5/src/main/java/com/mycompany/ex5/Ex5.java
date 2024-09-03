/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex5;
import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 1 caso o imovel seja novo ou 2 caso o imovel seja velho.");
        
        int NumI = scanner.nextInt();
        
        if(NumI == 1){
            System.out.println("O imóvel é novo, e seu valor é de: R$500.000.");
        }else if(NumI == 2){
            System.out.println("O imóvel é velho, e seu valor é de: R$150.000.");
        }else{
            System.out.println("Informações inválidas, tente novamente.");
        }
        Imovel imovel = new Imovel(NumI);
        
    }
}
