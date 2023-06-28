import java.io.File;

public class FileManager {
    public static void listarArchivosEnCarpeta() {
        String rcDirectorio = System.getProperty("user.dir");
        String rcRuta = rcDirectorio + File.separator + "Horarios";
        File folder = new File(rcRuta);

        // Verificar si la carpeta existe y es un directorio
        if (folder.exists() && folder.isDirectory()) {
            // Obtener la lista de archivos dentro de la carpeta Horarios
            File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".csv"));

            // Iterar sobre los archivos y realizar alguna accion
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        // Obtener el nombre del archivo sin la extensión .csv
                        String nombreArchivo = file.getName().replace(".csv", "");

                        // Realizar alguna acción con el archivo, como leer su contenido
                        System.out.println("Leyendo archivo: " + nombreArchivo);
                    }
                }
             } else {
            System.out.println("La carpeta 'Horarios' no existe ");
            }
        }
    }
}   

