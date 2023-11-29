
package proyectoempleados.Clases;

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

    public double calcularHorasExtras(int horasExtra) {
        double salario = Double.parseDouble(empleado.getSalario());
        double salarioPorHora = salario / 160; // Suponiendo una jornada de 160 horas al mes
        return salarioPorHora * 1.5 * horasExtra;
    }

    public double calcularDescuentoPorAusencias(int diasAusencia) {
        double salario = Double.parseDouble(empleado.getSalario());
        double salarioPorDia = salario / 20; //suponiendo q trabaja 160 h al mes y 8 h al dia, trabajaria 20 dias al mes.
        return salarioPorDia * diasAusencia;
    }

    public double calcularSalarioNeto() {
        double salario = Double.parseDouble(empleado.getSalario());
        double deducciones = calcularAportePatronalCCSS() + calcularAportePatronalLPT();

        // Puedes ajustar la lógica según sea necesario
        return salario - deducciones ;
    }
}
