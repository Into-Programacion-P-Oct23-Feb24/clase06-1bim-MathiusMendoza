/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del día de la semana");
        String cadena = entrada.nextLine();
        
        switch(cadena){// estructura que evalúa más de un caso      

            case "Lunes":
                System.out.printf("%s\n, es el primer dia"
                        + "de la semana", cadena);
                break;
            
            case "Martes":
            case "martes":
                System.out.printf("%s\n, es el segundo dia"
                        + "de la semana", cadena);
                break;
            case "Miercoles":
            case "MIERCOLES":
                System.out.printf("%s\n, es el tercer dia"
                        + "de la semana", cadena);
                break;
                
            case "Jueves":
            case "JUEVES":
                System.out.printf("%s\n, es el cuarto dia"
                        + "de la semana", cadena);
                break;
            
            case "Viernes":
            case "VIERNES":
            case "viernes":
                System.out.printf("%s\n, es el quinto dia"
                        + "de la semana", cadena);
                break;
             
            case "Sabado":
            case "SABADO":
                System.out.printf("%s\n, es el sexto dia"
                        + "de la semana", cadena);
                break;
                
            case "Domingo":
            case "DOMINGO":
                System.out.printf("%s\n, es el septimo dia"
                        + "de la semana", cadena);
                break;
             
            default://Nos permite definir métodos 
                System.out.println("ninguna de las anteriores");
                break;
        }
        
    }
}
