public class Jefe extends Empleado {
    private int telefono;
    public Jefe(String nombre, String nss, String domicilio, int telefono) {
        super(nombre, nss, domicilio);
        this.telefono=telefono;
    }

}