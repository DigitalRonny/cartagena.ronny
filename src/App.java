import java.util.Scanner;

import Utility.Utilitario;

public class App {
    public static void main(String[] args) throws Exception {
    
    
    rcLoginRonny();
    }
    
    public static void rcPresentar() {
    final String CEDULA = "\u001B[32m1726340514\u001B[0m";
    final String CORREO = "\u001B[32mronny.cartagena@epn.edu.ec\u001B[0m";
    final String NOMBRE = "\u001B[32mRONNY DAMIAN CARTAGENA TOAQUIZA\u001B[0m"; 

    System.out.println("Cedula: " + CEDULA);
    System.out.println("Correo: " + CORREO);
    System.out.println("Nombre: " + NOMBRE);
    } 

    public static void rcLoginRonny() throws Exception{    
        Scanner rcLeer = new Scanner(System.in);
        Scanner rc = new Scanner(System.in);//para el prees key
        String rcUsuarioProfe = "profe";
        String rcContraProfe = "1234";
        String rcUsuario1 = "ronny";
        String rcContraUsuario1 = "usuario123";

        int rcIntentosMaximos = 3;
        int rcIntentos = 0;
        boolean rcAccesoPermitido = false;

        

        while(rcIntentos < rcIntentosMaximos && !rcAccesoPermitido) {
            Utilitario.rcClearConsole();
            rcPresentar();
            System.out.println(" ----> LOGIN <---- ");
                System.out.print("Ingrese su usuario: ");
                String rcUsuario = rcLeer.nextLine();

                System.out.print("Ingrese su contrasenia: ");
                String contrasena = rcLeer.nextLine();

                if (rcUsuario.equals(rcUsuarioProfe) && contrasena.equals(rcContraProfe)) {
                    rcAccesoPermitido = true;
                    System.out.println("Acceso permitido. Bienvenido, "+ rcUsuarioProfe);
                    System.out.println("\nPress any key to continue...");
                    rc.nextLine();
                }else if(rcUsuario.equals(rcUsuario1) && contrasena.equals(rcContraUsuario1)){
                    rcAccesoPermitido = true;
                    System.out.println("Acceso permitido. Bienvenido, "+ rcUsuario1);
                    System.out.println("\nPress any key to continue...");
                    rc.nextLine();
                }else{
                    rcIntentos++;
                    System.out.println("Usuario o contrasenia incorrectos. Intento #" + rcIntentos);
                    System.out.println("\nPress any key to continue...");
                    rc.nextLine();
                }
            }
            if (!rcAccesoPermitido) {
                System.out.println("Se han excedido los intentos maximos. Acceso denegado.");
                rc.nextLine();
            } else {
                Menu.mostrarMenu();
            }
        }
}
