/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp02;

import static java.lang.System.out;
import java.util.Scanner;

/*
2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.

Fernando Avelino da Silva CB3008053
Vinícius Lopes Nunes      CB1640879
*/
public class TP02Ex02 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int maior, soma = 0, num;
        double media;

        try{
            out.print("Informe o 1º número: ");
            maior = scan.nextInt();
            
            for (int i = 2; i <= 10; i++) {
                out.print("Informe o " + i + "º número: ");
                num = scan.nextInt();
                
                soma += num;
                
                if(num > maior)
                    maior = num;
            }
            
            media = soma/10;
            
            
            out.println("Maior: " + maior +
                    "\nSoma: " + soma +
                    "\nMédia: " + media);
        }
        catch(Exception e){
            out.println("Erro : " + e.getMessage());
        }
    }
}
