public class Empleado {


    // Atributos
    private String nombre;
    private String nss;
    private String domicilio;


    // Constructor
    public Empleado(String nombre, String nss, String domicilio) {
        this.nombre = nombre;
        this.nss = nss;
        this.domicilio = domicilio;
    }


    // Métodos de acceso (getters y setters)
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNss() {
        return nss;
    }


    public void setNss(String nss) {
        this.nss = nss;
    }


    public String getDomicilio() {
        return domicilio;
    }


    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

}

