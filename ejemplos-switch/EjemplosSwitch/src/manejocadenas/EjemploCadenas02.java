/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjemploCadenas02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Esta linea de codigo me permite entrar datos por teclado
        entrada.useLocale(Locale.US);
        // Nos permite trabajar para que lea los decimales
        String cadenaFinal = "Datos Ingresados\n";

        System.out.println("Ingrese la ciudad");
        String ciudad = entrada.nextLine(); // Quito
        // nextLine permite entrada del usuario

        cadenaFinal = String.format("%sCiudad:%s\n",
                cadenaFinal, ciudad);

        //System.out.printf("%s\n",cadenaFinal);
        System.out.println("Ingrese la provincia");
        String provincia = entrada.nextLine(); // 

        cadenaFinal = String.format("%sProvincia:%s\n",
                cadenaFinal,
                provincia);

        System.out.println("Ingrese el pais");
        String pais = entrada.nextLine(); // 

        cadenaFinal = String.format("%sPaís:%s\n",
                cadenaFinal,
                pais);

        System.out.printf("%s", cadenaFinal);

    }
}
