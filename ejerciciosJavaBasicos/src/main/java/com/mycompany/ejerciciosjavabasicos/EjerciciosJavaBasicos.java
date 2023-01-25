/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciciosjavabasicos;

import java.util.Scanner;

public class EjerciciosJavaBasicos {

    public static double notaFinal(double n1, double n2, double n3) {
        return (n1 * 0.3) + (n2 * 0.3) + (n3 + 0.4);

    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double n1, n2, n3, calculo;

        System.out.println("ingrese la primera nota");
        n1 = lector.nextFloat();
        System.out.println("ingrese la segunda nota");
        n2 = lector.nextFloat();
        System.out.println("ingrese la tercera nota");
        n3 = lector.nextFloat();

        calculo = notaFinal(n1, n2, n3);
        double notaFinal = 0;

        System.out.println("la nota final es; " + notaFinal);

    }
}
