
package incidencias;

import IU.RegistroIncidencias;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author wendy_6rrub
 */
public class Modulosdaoo {
        private static final String RUTA_EMPLEADOS = "Empleados.txt";
    private static final String RUTA_FALTAS = "Faltas.txt";
    
    
    RegistroIncidencias au= new RegistroIncidencias();
    
    public static boolean existeCedula(String cedula) {
        //verifica si la cédula existe en "Empleados.txt"
        File archivoEmpleados = new File(RUTA_EMPLEADOS);

        try (BufferedReader br = new BufferedReader(new FileReader(archivoEmpleados))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String cedulaEmpleado = partes[2];

                if (cedula.equals(cedulaEmpleado)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
    
    
    public static void agregarFalta(String cedula, LocalDate fecha, String tipoFalta, String horasInasistencia, String detalles) {
        File archivoFaltas = new File("Faltas.txt");

        // Leer el contenido actual del archivo de faltas
        List<String> lineasFaltas = new ArrayList<>();
        boolean cedulaEncontrada = false;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoFaltas))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineasFaltas.add(linea);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Si la cédula no existe, agregar una nueva línea al archivo de faltas
        if (!cedulaEncontrada) {
            // Crear una nueva línea con el valor correspondiente al tipo de falta
            lineasFaltas.add(String.format("%s,%s,%s,%s,%s", cedula, fecha, tipoFalta, horasInasistencia, detalles));
        }

        // Escribir el contenido actualizado en el archivo de faltas
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoFaltas))) {
            for (String linea : lineasFaltas) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public static List<String> obtenerDiasOctubre() {
        return Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31");
    }
    
    public static List<String> obtenerDiasNoviembre() {
        return Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30");
    }
    
    public static List<String> obtenerMes() {
        return Arrays.asList("Octubre", "Noviembre");
    }
    
    public static List<String> obtenerHorasAusente() {
        return Arrays.asList("1","2","3","4","5","6","7","8");
    }
    
    public String armarFecha(String nombreMes, String nombreDia) {
        int diaSeleccionado = Integer.parseInt(nombreDia);
        int añoPredeterminado = 2023;
        String numeroMes = obtenerNumeroMes(nombreMes);
        return String.format("%02d/%s/%d", diaSeleccionado, numeroMes, añoPredeterminado);
    }

    public String obtenerNumeroMes(String nombreMes) {
        switch (nombreMes) {
            case "Octubre":
                return "10";
            case "Noviembre":
                return "11";
            default:
                return "";
        }
    }
    
}
