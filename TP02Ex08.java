/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp02;

import static java.lang.System.out;
import java.util.Scanner;

/*
8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a digitação dos valores solicitar uma constante multiplicativa, 
que deverá multiplicar cada valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições correspondentes. 
Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por colunas.

Fernando Avelino da Silva CB3008053
Vinícius Lopes Nunes      CB1640879
*/
public class TP02Ex08 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int[][] v1 = new int[3][4], v2 = new int[3][4];
        int mult;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                out.print("Informe [" + i + "][" + j + "]: ");
                v1[i][j] = scan.nextInt();
            }
        }
        
        out.print("Informe a constante multiplicativa: ");
        mult = scan.nextInt();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                v2[i][j] = v1[i][j] * mult;                
            }
        }
        
        out.print("\n-------------- V1 --------------\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {                
                out.print("[" + v1[i][j] + "] ");
            }
            out.println();
        }
        
        out.print("\n-------------- V2 --------------\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {                
                out.print("[" + v2[i][j] + "] ");
            }
            out.println();
        }
    }
}
