/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularIva;

import java.util.Scanner;

/**
 *
 * @author Jz
 */
public class CalcularnumeroAleaotorio {
    
    public static String multiplicacion (int n1 , int n2){
        return n1 + "*" + n2 + "=" +(n1*n2);
        
    }
    
    
    public static void main(String[] args) {
     Scanner multiplo = new Scanner(System.in);
        
    int n;
    
    System.out.println("ingrese un numero a multiplicar");
    n= multiplo.nextInt();
    
        for (int i = 0; i < 13; i++) {
            System.out.println(multiplicacion(n,i)) ;
        }
    
 }
}
