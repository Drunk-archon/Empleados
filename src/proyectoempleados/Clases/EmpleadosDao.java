
package proyectoempleados.Clases;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;



public class EmpleadosDao {
    
    private static final String RUTA_ARCHIVO = "Empleados.txt";

    // Método para guardar un nuevo empleado en el archivo
    public static void agregarNuevoEmpleado(Empleados nuevoEmpleado) {
    // Archivo para agregar nuevo empleado
    File archivo = new File("Empleados.txt");

    // Convierte el nuevo empleado a formato de línea
    String nuevaLinea = nuevoEmpleado.toString();

    // Agrega la nueva línea al archivo
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
        bw.write(nuevaLinea);
        bw.newLine();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
     
public static boolean cedulaRegistrada(String cedula) {
    // Verificar que la cédula tenga exactamente 9 dígitos
    if (!cedula.matches("\\d{9}")) {
        return false; // Cédula inválida
    }

    File archivo = new File(RUTA_ARCHIVO);

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");
            // Verificar si hay suficientes partes y la cédula coincide
            if (partes.length > 2 && partes[2].trim().equals(cedula.trim())) {
                return true; // Cédula encontrada
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    return false; // Cédula no encontrada
}
    
    public static List<String> obtenerPuestosDisponibles() {
        return Arrays.asList("Responsable de ventas", "Responsable de marketing", "Director Ejecutivo", "Director de Recursos Humanos","Jefe de la empresa");
    }

    public static List<String> obtenerDepartamentosDisponibles() {
        return Arrays.asList("Ventas", "Marketing", "Gestion y administracion", "Recursos Humanos");
    }

    public static List<String> obtenerContratosDisponibles() {
        return Arrays.asList("Tiempo Completo", "Medio Tiempo", "Contrato Temporal", "Contrato por Proyecto");
    }
    
    
     public static void actualizarEmpleado(String[] nuevosDatos) {
        String nombreArchivo = "Empleados.txt";
        File archivo = new File(nombreArchivo);
        List<String> lineas = new ArrayList<>();

        // Lee el archivo y guarda cada línea en la lista
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Encuentra y actualiza la línea que contiene la cédula
        for (int i = 0; i < lineas.size(); i++) {
            String[] datos = lineas.get(i).split(",");
            if (datos[2].equals(nuevosDatos[2])) { // Comparar con la cédula existente
                // Actualizar los datos con los nuevos valores
                for (int j = 0; j < nuevosDatos.length; j++) {
                    datos[j] = nuevosDatos[j];
                }
                // Actualizar la línea en la lista
                lineas.set(i, String.join(",", datos));
                break;
            }
        }

        // Escribe todas las líneas actualizadas de vuelta al archivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
             JOptionPane.showMessageDialog(null, "Datos actualizados en el archivo correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            // Mostrar mensaje de error
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos en el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public static void eliminarDatos(String cedulaAEliminar) {
       try {
        BufferedReader br = new BufferedReader(new FileReader("Empleados.txt"));
        String linea;
        StringBuilder fileContent = new StringBuilder();
        boolean cedulaEncontrada = false;

        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(",");
            String cedula = datos[2].trim();  // Asegúrate de ajustar el índice según tu estructura

            if (cedula.equals(cedulaAEliminar.trim())) {
                // Marcar que la cédula fue encontrada
                cedulaEncontrada = true;
            } else {
                // Agregar la línea al contenido del archivo
                fileContent.append(linea).append("\n");
            }
        }

        br.close();

        if (cedulaEncontrada) {
            // Sobrescribir el archivo con los datos sin la línea eliminada
            Files.write(Paths.get("Empleados.txt"), fileContent.toString().getBytes());
            JOptionPane.showMessageDialog(null, "Datos eliminados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron datos con la cédula proporcionada.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al eliminar los datos en el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    
     
     
  public static Empleados consultarEmpleados(String criterio, String valor) {
    List<Empleados> resultados = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader("Empleados.txt"))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            // Puedes ajustar los criterios según tus necesidades
            String[] datos = linea.split(",");
            if ("nombre".equalsIgnoreCase(criterio) && datos[0].equalsIgnoreCase(valor)) {
                // Utiliza el constructor de Empleados para crear una instancia
                return new Empleados(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8], datos[9], datos[10], datos[11]);
            } else if ("cedula".equalsIgnoreCase(criterio) && datos[2].equalsIgnoreCase(valor)) {
                // Utiliza el constructor de Empleados para crear una instancia
                return new Empleados(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8], datos[9], datos[10], datos[11]);
            }
            // Agrega más condiciones según los criterios que necesites
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    return null; // Devuelve null si no se encuentra ningún empleado
}
}


    