
package ClasesDeUso;


public class Cliente extends Thread {
    private String nombreCompleto;
    private Cuenta cuentas;
   // private Cuenta numeroCuenta;
    private String fechaNacimiento;
    private char genero;
    private String estadoCivil;
    private int telefono;
    private String direccion;
    private String lugarDeTrabajo;
    private double salarioPromedio;
    private int validarCuenta;
  //  private Cuenta Descripcion;
  //  private ArrayList<Beneficiario> beneficiarios;
    private String sucursales;

    public Cliente(
            String nombreCompleto, 
            Cuenta cuentas, 
            String fechaNacimiento, 
            char genero, 
            String estadoCivil, 
            int telefono, 
            String direccion, 
            String lugarDeTrabajo, 
            double salarioPromedio, 
            String sucursales, int validarCuenta
            ) {
        this.nombreCompleto = nombreCompleto;
        this.cuentas = cuentas;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.telefono = telefono;
        this.direccion = direccion;
        this.lugarDeTrabajo = lugarDeTrabajo;
        this.salarioPromedio = salarioPromedio;
        this.sucursales = sucursales;
        this.validarCuenta = validarCuenta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreCompleto=" + getNombreCompleto() + ", cuentas=" + getCuentas() + ", fechaNacimiento=" + getFechaNacimiento() + ", genero=" + getGenero() + ", estadoCivil=" + getEstadoCivil() + ", telefono=" + getTelefono() + ", direccion=" + getDireccion() + ", lugarDeTrabajo=" + getLugarDeTrabajo() + ", salarioPromedio=" + getSalarioPromedio() + ", validarCuenta=" + getValidarCuenta() + ", sucursales=" + getSucursales() + '}';
    }
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
     * @return the cuentas
     */
    public Cuenta getCuentas() {
        return cuentas;
    }

    /**
     * @param cuentas the cuentas to set
     */
    public void setCuentas(Cuenta cuentas) {
        this.cuentas = cuentas;
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
