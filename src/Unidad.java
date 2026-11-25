public class Unidad {
    private String nombre;
    private String descripcion;
    public Unidad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public String mostrarInformacion() {
        return "Unidad: " + nombre + "\nDescripcion: " + descripcion;
    }
}