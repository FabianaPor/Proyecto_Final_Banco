package ClasesDeUso;

import java.util.ArrayList;

public class Cliente extends Thread {

    private String nombreCompleto;
   // private Cuenta cuentas;
 private ArrayList<Cuenta> Acuentas;
    // private Cuenta numeroCuenta;
    private String fechaNacimiento;
    private char genero;
    private String estadoCivil;
    private int telefono;
    private String direccion;
    private String lugarDeTrabajo;
    private double salarioPromedio;
    private int validarCuenta;
    private int Monto;
    //  private Cuenta Descripcion;
    //  private ArrayList<Beneficiario> beneficiarios;
    private String sucursales;

    @Override
    public String toString() {
        return "Cliente{" + "nombreCompleto=" + nombreCompleto + ", Acuentas=" + Acuentas + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", estadoCivil=" + estadoCivil + ", telefono=" + telefono + ", direccion=" + direccion + ", lugarDeTrabajo=" + lugarDeTrabajo + ", salarioPromedio=" + salarioPromedio + ", validarCuenta=" + validarCuenta + ", Monto=" + Monto + ", sucursales=" + sucursales + '}';
    }

    public Cliente(String nombreCompleto, 
            
            String fechaNacimiento, 
            char genero, 
            String estadoCivil, 
            int telefono, 
            String direccion, 
            String lugarDeTrabajo, 
            double salarioPromedio, 
            int validarCuenta, 
            int Monto, 
            String sucursales) {
        this.nombreCompleto = nombreCompleto;
      
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.telefono = telefono;
        this.direccion = direccion;
        this.lugarDeTrabajo = lugarDeTrabajo;
        this.salarioPromedio = salarioPromedio;
        this.validarCuenta = validarCuenta;
        this.Monto = Monto;
        this.sucursales = sucursales;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the Acuentas
     */
    public ArrayList<Cuenta> getAcuentas() {
        return Acuentas;
    }

    /**
     * @param Acuentas the Acuentas to set
     */
    public void setAcuentas(ArrayList<Cuenta> Acuentas) {
        this.Acuentas = Acuentas;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * @return the estadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the lugarDeTrabajo
     */
    public String getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }

    /**
     * @param lugarDeTrabajo the lugarDeTrabajo to set
     */
    public void setLugarDeTrabajo(String lugarDeTrabajo) {
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    /**
     * @return the salarioPromedio
     */
    public double getSalarioPromedio() {
        return salarioPromedio;
    }

    /**
     * @param salarioPromedio the salarioPromedio to set
     */
    public void setSalarioPromedio(double salarioPromedio) {
        this.salarioPromedio = salarioPromedio;
    }

    /**
     * @return the validarCuenta
     */
    public int getValidarCuenta() {
        return validarCuenta;
    }

    /**
     * @param validarCuenta the validarCuenta to set
     */
    public void setValidarCuenta(int validarCuenta) {
        this.validarCuenta = validarCuenta;
    }

    /**
     * @return the Monto
     */
    public int getMonto() {
        return Monto;
    }

    /**
     * @param Monto the Monto to set
     */
    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    /**
     * @return the sucursales
     */
    public String getSucursales() {
        return sucursales;
    }

    /**
     * @param sucursales the sucursales to set
     */
    public void setSucursales(String sucursales) {
        this.sucursales = sucursales;
    }

   
}
