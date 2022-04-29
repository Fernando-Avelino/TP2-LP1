/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp01;

import java.util.Scanner;

/**
1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área. 
 */

public class TP01Ex01 {
    public static void main (String args[]){
    
    double base;
    double altura;
    double area;
        
   Scanner input = new Scanner(System.in);
	
        System.out.println("Digite o valor da Base");
	base = input.nextDouble();
	System.out.println("Digite o valor da Altura");
	altura = input.nextDouble();
	area = (base * altura);
	System.out.println("A Area do Retângulo " + (int)area);
    }  
}
