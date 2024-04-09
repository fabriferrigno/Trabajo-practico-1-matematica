package com.mycompany.tp1matematica;

import java.util.Scanner;

public class Tp1matematica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero binario de 16 digitos: ");
        String binarioStr = scanner.nextLine();

        // Verificamos que la longitud del número binario sea de 16 dígitos
        if (binarioStr.length() != 16) {
            System.out.println("El numero binario debe tener 16 dígitos.");
            return;
        }

        // Convertir a decimal
        int decimal = Integer.parseInt(binarioStr, 2);
        System.out.println("El numero decimal equivalente es: " + decimal);

        // Convertir a octal
        String octal = Integer.toOctalString(decimal);
        System.out.println("El numero octal equivalente es: " + octal);

        // Convertir a hexadecimal
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("El numero hexadecimal equivalente es: " + hexadecimal);

        scanner.close();
    }
}