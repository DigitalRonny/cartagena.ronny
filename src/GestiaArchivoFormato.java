import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public interface GestiaArchivoFormato {
    void rcReadHorarioProfesores(String directorioHorarios) throws IOException;
    void rcShowAsignatura();
    void rcShowProfesores();
}
