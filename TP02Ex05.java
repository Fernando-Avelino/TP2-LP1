/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp02;

import static java.lang.System.out;
import java.util.Scanner;

/*
5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.

Fernando Avelino da Silva CB3008053
Vinícius Lopes Nunes      CB1640879
 */
public class TP02Ex05 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int[][] v = new int[3][2];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                out.printf("Informe [" + i + "][" + j + "]: ");
                v[i][j] = scan.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                out.print("[" + v[i][j] + "] ");                
            }
            out.println();
        }           
    }
}
