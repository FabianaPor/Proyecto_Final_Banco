/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeUso;

/**
 *
 * @author Magally Portillo
 */
public class Cuenta {
    private String numeroCuenta;
    private String Descripcion;
    private String beneficiarios;
    private int Monto;

    public Cuenta(String numeroCuenta, String Descripcion, String beneficiarios, int Monto) {
        this.numeroCuenta = numeroCuenta;
        this.Descripcion = Descripcion;
        this.beneficiarios = beneficiarios;
        this.Monto = Monto;
    }

    Cuenta() {
      }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", Descripcion=" + Descripcion + ", beneficiarios=" + beneficiarios + '}';
    }

    /**
     * @return the numeroCuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the beneficiarios
     */
    public String getBeneficiarios() {
        return beneficiarios;
    }

    /**
     * @param beneficiarios the beneficiarios to set
     */
    public void setBeneficiarios(String beneficiarios) {
        this.beneficiarios = beneficiarios;
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

       
}
