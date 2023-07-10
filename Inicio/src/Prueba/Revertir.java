package Prueba;

import java.util.Scanner;

public class Revertir {

    public static void main(String[] args) {
        String palabra;
        int i;  

        Scanner tecl = new Scanner(System.in);
        System.out.println("Escribe una Palabra ");
        palabra = tecl.nextLine();

        for (i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }
    }

}
