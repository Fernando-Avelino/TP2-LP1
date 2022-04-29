/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp02;

import static java.lang.System.out;
import java.util.Scanner;

/*
1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área. 

Fernando Avelino da Silva CB3008053
Vinícius Lopes Nunes      CB1640879
*/
public class TP02Ex01 {
 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int a, b;
        
        out.print("Informe o 1º número: ");
        a = scan.nextInt();
        
        do {
            out.print("Informe o 2º número: ");
            b = scan.nextInt();
        } while (a >= b);
        
        out.print("O segundo número é maior que o primeiro");              
    }
}