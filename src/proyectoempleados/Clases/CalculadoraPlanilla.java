
package proyectoempleados.Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author franc
 */
public class CalculadoraPlanilla {
    private Empleados empleado;
   
    public CalculadoraPlanilla(Empleados empleado) {
        this.empleado = empleado;    
    }
   
    public double calcularAportePatronalCCSS() {
        double salario = Double.parseDouble(empleado.getSalario());

        double seguroEnfermedadMaternidad = salario * 0.0925;
        double invalidezVejezMuerte = salario * 0.0508;
        return seguroEnfermedadMaternidad + invalidezVejezMuerte;
    }

    public double calcularAportePatronalLPT() {
        double salario = Double.parseDouble(empleado.getSalario());

        double aporteBancoPopular = salario * 0.0025;
        double aporteFondoCapitalizacion = salario * 0.03;
        double aporteFondoPensiones = salario * 0.005;
        double aporteINS = salario * 0.01;
        return aporteBancoPopular + aporteFondoCapitalizacion + aporteFondoPensiones + aporteINS;
    }
    
      public double SalarioPorDia() {
        double salarioMensual = Double.parseDouble(empleado.getSalario());
        int horasJornada = 160; //suponiendo una jornada de 160h
        int diasSemana = 5; 
        return salarioMensual / (horasJornada / diasSemana);
    }
      public double salarioPorHora() {
        double salarioMensual = Double.parseDouble(empleado.getSalario());
        int horasJornada = 160; // 8 horas al día
        return salarioMensual / horasJornada;
    }

    public double calcularHorasExtras(int horasExtra) {
        double salario = Double.parseDouble(empleado.getSalario());
        double salarioPorHora = salario / 160; 
        return salarioPorHora * 1.5 * horasExtra;
    }
    
    public double rebajaTardias() {
        String cedula = empleado.getCedula();
    int horasTardias = 0;

    try (BufferedReader reader = new BufferedReader(new FileReader("Faltas.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.split(",");
            if (partes.length == 5) {
                String cedulaFalta = partes[0].trim();
                String tipoFalta = partes[2].trim();

                if (cedula.equals(cedulaFalta) && tipoFalta.equals("Tardia")) {
                  
                    horasTardias += Integer.parseInt(partes[3]);
                }
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    double salarioPorHora = salarioPorHora();
    return salarioPorHora * horasTardias;  
    }

    public double calcularDescuentoPorAusencias() {
    String cedula = empleado.getCedula();

    int horasFaltadasInjustificadas = 0;
    int faltasJustificadas = 0;

    try (BufferedReader reader = new BufferedReader(new FileReader("Faltas.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.split(",");
            if (partes.length == 5) {
                String cedulaFalta = partes[0].trim();
                String tipoFalta = partes[2].trim();

                if (cedula.equals(cedulaFalta)) {
                    // Se encontró una falta para el empleado
                    if (tipoFalta.equals("Injustificada")) {
                        horasFaltadasInjustificadas += 8; 
                    } else if (tipoFalta.equals("Justificada")) {
                        faltasJustificadas++;
                    }
                }
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

  
    if (horasFaltadasInjustificadas > 0) {
      return salarioPorHora() * horasFaltadasInjustificadas;
    } else if (faltasJustificadas > 3) {
        return SalarioPorDia() * (faltasJustificadas - 3);
    } else {
        return 0;
    }
    }

  public double calcularSalarioNeto(int horasExtras) {
    double salario = Double.parseDouble(empleado.getSalario());
    double deducciones = calcularAportePatronalCCSS() + calcularAportePatronalLPT() + calcularDescuentoPorAusencias()+rebajaTardias();
    double salarioPorHorasExtras = calcularHorasExtras(horasExtras);
    return salario - deducciones + salarioPorHorasExtras;
}
}
