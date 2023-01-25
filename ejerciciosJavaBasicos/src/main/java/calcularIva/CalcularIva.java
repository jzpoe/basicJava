/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularIva;

import static calcularIva.CalcularIva.compraIva;
import java.util.Scanner;

public class CalcularIva {

    public static double compraIva (double p){
        double iva= p*0.19;
        return iva;
    }
    
    
    public static void main(String[] args) {

        Scanner iva = new Scanner(System.in);
        double compra, IVA,TOTAL;

        System.out.println("ingerese el valor de la compra: ");
        compra = iva.nextDouble();
        
        IVA= compraIva(compra);
        
        
        
        System.out.println("el valor sin el iva es de: "+ compra);
        System.out.println("el valor con el iva es de : "+ (compra+ IVA));
        

    }
}
