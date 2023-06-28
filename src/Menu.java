import java.io.IOException;
import java.util.Scanner;
import Utility.Utilitario;

public class Menu {
    public enum rcOpciones {SALIR, VISUALIZAR_PROFESORES, VISUALIZAR_TITULO, VISUALIZAR_HORARIO, VISUALIZAR_HORARIO_PROFESOR};
    
    static Scanner leer = new Scanner(System.in);
    static Scanner rcOpc = new Scanner(System.in);
    static Scanner rc = new Scanner(System.in);
    private static String rcUsuarioProfe = "profe";

    

    public static void mostrarMenu() {        
        rcOpciones[] opciones = rcOpciones.values();
        for (rcOpciones opcion : opciones) {
            System.out.println(opcion);
        }

        //Inicia el menu
        rcOpciones rcOpcionSeleccionada;//declara una variable llamada opcionSeleccionada de tipo rcOpciones

        do {
            Utilitario.rcClearConsole();
            System.out.println("Carga Horario de Profesores");
            System.out.println("Usuario: "+rcUsuarioProfe.toUpperCase());
            
            //el metodo values() del enum Opciones para obtener un arreglo de todas las opciones disponibles
            //Imprimir las opciones:
            for (rcOpciones rcOpcion : rcOpciones.values()) {
            System.out.println(rcOpcion.ordinal() + "." + rcOpcion.name());
            }
            System.out.print("INGRESE UNA OPCION: ");
            int opcionIngresada = Utilitario.rcVerificarEntero(-1);

            rcOpcionSeleccionada = rcOpciones.values()[opcionIngresada];

            if (opcionIngresada >= 0 && opcionIngresada < rcOpciones.values().length) {
                rcOpcionSeleccionada = rcOpciones.values()[opcionIngresada];
                
                switch (rcOpcionSeleccionada) {
                    case SALIR:
                    System.out.println("Saliendo del programa...");
                    System.out.println("Regrese pronto " + rcUsuarioProfe.toUpperCase());
                    break;
                    case VISUALIZAR_PROFESORES:
                        System.out.println("Visualizando titulos de los archivos...");
                        FileManager.listarArchivosEnCarpeta();
                        rc.nextLine();
                        break;
                    case VISUALIZAR_TITULO:
                        
                        break;
                    case VISUALIZAR_HORARIO:
                        String rcDirectorio = "src\\\\Horarios";
                        
                        rc.nextLine();
                    case VISUALIZAR_HORARIO_PROFESOR:
                        break;
                    default:
                        System.out.println("Opcion invalida. Intente nuevamente.");
                        break;
                    }
            }else {
                    System.out.println("Opcion invalida. Intente nuevamente.");
                }
        } while (rcOpcionSeleccionada  != rcOpciones.SALIR);        
    }    
}