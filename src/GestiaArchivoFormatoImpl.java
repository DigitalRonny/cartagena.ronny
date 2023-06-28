import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GestiaArchivoFormatoImpl implements GestiaArchivoFormato {
    @Override
    public void rcReadHorarioProfesores(String directorioHorarios) throws IOException {
        String carpetaArchivos = "\\Horarios\\";

        String[] nombresArchivos = {
            "202110105-CHUNCHO JIMENEZ ANGEL DAVID.csv",
            "202111083-HIDALGO CRUZ PABLO ESTEBAN.csv",
            "202120757-ALEMAN OSORIO CARLOS ALEJANDRO.csv"
        };

        String separador = ",";

        for (String nombreArchivo : nombresArchivos) {
            String rutaArchivo = carpetaArchivos + nombreArchivo;

            try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    // Procesa cada linea del archivo CSV
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void rcShowAsignatura() {
    
    }

    @Override
    public void rcShowProfesores() {
        
    }
}

