/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp02;

import static java.lang.System.out;
import java.util.Scanner;

/*
6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.

Fernando Avelino da Silva CB3008053
Vinícius Lopes Nunes      CB1640879
 */
public class TP02Ex06 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[][] nome = new String[2][3];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                out.print("Informe [" + i + "][" + j + "]: ");
                nome[i][j] = scan.next();
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                out.print("[" + nome[i][j] + "] ");                
            }
            out.println();
        }           
    }
}
