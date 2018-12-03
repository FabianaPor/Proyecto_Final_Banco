package ClasesDeUso;

public class Empleado {
    
    private String nombre;
    private String identificacion;
    private String sucursal;

    public String toStringID() {
        return "identificacion=" + identificacion;
    }

    public String toStringNombre() {
        return "nombre=" + nombre;
    }
    public String toStringSucursal() {
        return "sucursal=" +  sucursal;
    }

    @Override
    public String toString() {
        return identificacion;
    }
    
    public String toStringTodo() {
        return "Empleado{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", sucursal=" + sucursal + '}';
    }



    public Empleado(String nombre, String identificacion, String sucursal) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.sucursal = sucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
    
    
}
