/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contraseñaSegura;

import java.util.Scanner;

// nos va a devolver un valor booleano true (contraseña segura) o false (contraseña no segura) 



public class Contrasena {
    
public static boolean esSegura(String password){

if (password.length()>8){ // DEBE TENER MAS DE 8 CARACTERES
    boolean mayuscula= false; //verificara si hay una letra mayusculasi la encuentra entrata en true
    boolean numero = false;// verificara si hay un numero y si lo encuentra entrata a true 
    char c;
    
    for (int  i=0; i<password.length(); i++){  // se realizara un ciclo for para recorrer la cadena de caracteres y encontrar si tiene o no una mayuscula y un numero
        c= password.charAt(i); // se le asigna e valor a cada caracter es decir, revisara una a una los caracteres para determinar si es mayuscula o numero y se almacenara en la letra c
        
        if (Character.isDigit(c)) //despues de tener cada letra almacenada en la vaiable c con esta funcion revisara si hay un numero dentro del password
            numero= true;
        if(Character.isUpperCase(c))
            mayuscula= true;// validara si encuentra una mayuscula de la variable que las almacea que es la c
    }
    
   if (numero && mayuscula) // despues de que el for verifique si dentro de la contraseña hay un numero dentro de ella y una mayuscula evaluara que ambas sean true 
    return true;
   else 
       return false;
}else {
    return false;
}
    

}
    
    public static void main(String[] args){
        Scanner pass = new Scanner(System.in);
        String password;
        
        System.out.println("Ingrese la contraseña");
        password= pass.next();
        
        if (esSegura(password))
            System.out.println("la contraseña es segura");
        else
            System.out.println("la contraseña no es segura ");
        
    }
    
}
