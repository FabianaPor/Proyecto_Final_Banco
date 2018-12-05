package ClasesDeUso;



public class Cliente extends Thread {

    private String nombreCompleto;
    
    private String fechaNacimiento;
    private char genero;
    private String estadoCivil;
    private String telefono;
    private String direccion;
    private String lugarDeTrabajo;
    private double salarioPromedio;
    private int validarCuenta;
    private String sucursales;
    private String ID;

    @Override
    public String toString() {
        return "Cliente{" + "nombreCompleto=" + nombreCompleto + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", estadoCivil=" + estadoCivil + ", telefono=" + telefono + ", direccion=" + direccion + ", lugarDeTrabajo=" + lugarDeTrabajo + ", salarioPromedio=" + salarioPromedio + ", validarCuenta=" + validarCuenta + ", sucursales=" + sucursales + ", ID=" + ID + '}';
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }

    public void setLugarDeTrabajo(String lugarDeTrabajo) {
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    public double getSalarioPromedio() {
        return salarioPromedio;
    }

    public void setSalarioPromedio(double salarioPromedio) {
        this.salarioPromedio = salarioPromedio;
    }

    public int getValidarCuenta() {
        return validarCuenta;
    }

    public void setValidarCuenta(int validarCuenta) {
        this.validarCuenta = validarCuenta;
    }

    public String getSucursales() {
        return sucursales;
    }

    public void setSucursales(String sucursales) {
        this.sucursales = sucursales;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Cliente(String nombreCompleto, String fechaNacimiento, char genero, String estadoCivil, String telefono, String direccion, String lugarDeTrabajo, double salarioPromedio, int validarCuenta, String sucursales, String ID) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.telefono = telefono;
        this.direccion = direccion;
        this.lugarDeTrabajo = lugarDeTrabajo;
        this.salarioPromedio = salarioPromedio;
        this.validarCuenta = validarCuenta;
        this.sucursales = sucursales;
        this.ID = ID;
    }

}
