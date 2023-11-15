/*
*   Generar un programa que permita ingresar un nombre de una ciudad;
*   Los nombres de las ciudades permitidas son las que empiezan con vocal.
*   Si la ciudad es permitida presentar un mensaje:
*   Nombre con inicial O de otavalo
*   Si la ciudad no es permitida presentar un mensaje:
*   opción incorrecta; ninguna de las anteriores
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
      
        
        System.out.println("Ingrese su nombre por favor ");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese su apellido por favor ");
        String apellido = entrada.nextLine();
        
        System.out.println("Ingrese su Universidd  por favor ");
        String universidad = entrada.nextLine();
        
        System.out.println("Ingrese su edad por favor ");
        int edad = entrada.nextInt();
        
        
        
       
       
        char valor = nombre.charAt(0); // obtener el primer caracter de una
                                       // cadena
        //  L   o   j   a
        //  0   1   2   3
        
        switch(valor){
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
          
           System.out.printf("%s %s con edad de %s estudiante de %s\n", 
                   nombre.toUpperCase(),apellido.toUpperCase(),
                    edad,universidad.toUpperCase());
            break;
                
            default:
                 System.out.printf("%s %s con edad de %s, estudiante de %s\n", 
                    nombre.toLowerCase(),apellido.toLowerCase(),
                    edad,universidad.toLowerCase());
                break;
                
        }
        
    }
}
