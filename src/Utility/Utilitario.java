package Utility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilitario {
    public static void rcClearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
            }
        } catch (Exception ex) {
            // Manejar cualquier excepcion que pueda ocurrir al limpiar la consola
            ex.printStackTrace();
        }
    }


    public static int rcVerificarEntero(int opc){
        Scanner in = new Scanner(System.in);

        boolean esEntero = false;

        while (!esEntero) {
            try {
                if (in.hasNextInt()) {
                    opc = in.nextInt();
                    if (opc >= 0) {
                        esEntero = true;
                    } else {
                        System.out.print("Debe ingresar un entero no negativo: ");
                    }
                } else {
                    System.out.print("Debe ingresar un entero valido: ");
                    in.next();
                }
            } catch (InputMismatchException e) {
                System.out.print("Debe ingresar un entero valido: ");
                in.next(); 
            }
        }

        return opc;
    }
}
