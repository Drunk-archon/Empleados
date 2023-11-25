
package proyectoempleados.Clases;


public class Empleados {
    
    private String Nombre;
    private String Apellido; 
    private String cedula;
    private String nacimiento;
    private String dirección; 
    private String teléfono;
    private String email; 
    private String fechadeingreso;
    private String puesto;
    private String departamento; 
    private String contrato;
    private String salario;
    
    private int horasTrabajadas;
    private int horasExtra;
    private int ausencias;
    private double seguroSocial;
    private double aportePatronalCCSS;
    private double leyProteccionTrabajador;
    private double aportePatronalLPT;
    

    public Empleados(String Nombre, String Apellido, String cedula, String nacimiento, String dirección, String teléfono, String email, String fechadeingreso, String puesto, String departamento, String contrato, String salario) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.cedula = cedula;
        this.nacimiento = nacimiento;
        this.dirección = dirección;
        this.teléfono = teléfono;
        this.email = email;
        this.fechadeingreso = fechadeingreso;
        this.puesto = puesto;
        this.departamento = departamento;
        this.contrato = contrato;
        this.salario = salario;
        
    }

    public Empleados(String nombre, String apellido, String cedula, String fechadeingreso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechadeingreso() {
        return fechadeingreso;
    }

    public void setFechadeingreso(String fechadeingreso) {
        this.fechadeingreso = fechadeingreso;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
    return Nombre + "," + Apellido + "," + cedula + "," + nacimiento + "," +dirección + "," +
            teléfono + "," + email + "," + fechadeingreso + "," + puesto + "," + departamento + "," +
            contrato + "," + salario;
}

    public Empleados(int horasTrabajadas, int horasExtra, int ausencias, double retenciones, double aportePatronalCCSS, double leyProteccionTrabajador) {
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtra = horasExtra;
        this.ausencias = ausencias;
        this.aportePatronalCCSS = aportePatronalCCSS;
        this.leyProteccionTrabajador = leyProteccionTrabajador;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getAusencias() {
        return ausencias;
    }

    public void setAusencias(int ausencias) {
        this.ausencias = ausencias;
    }



    public double getSeguroSocial() {
        return seguroSocial;
    }

    public void setSeguroSocial(double seguroSocial) {
        this.seguroSocial = seguroSocial;
    }

    public double getAportePatronalCCSS() {
        return aportePatronalCCSS;
    }

    public void setAportePatronalCCSS(double aportePatronalCCSS) {
        this.aportePatronalCCSS = aportePatronalCCSS;
    }

    public double getLeyProteccionTrabajador() {
        return leyProteccionTrabajador;
    }

    public void setLeyProteccionTrabajador(double leyProteccionTrabajador) {
        this.leyProteccionTrabajador = leyProteccionTrabajador;
    }

    public double getAportePatronalLPT() {
        return aportePatronalLPT;
    }

    public void setAportePatronalLPT(double aportePatronalLPT) {
        this.aportePatronalLPT = aportePatronalLPT;
    }

 
}
