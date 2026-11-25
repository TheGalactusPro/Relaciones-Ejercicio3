import java.util.ArrayList;
public class Curso {
    private String nombre;
    private String instructor;
    private ArrayList<Unidad> unidades;
    public Curso(String nombre, String instructor) {
        this.nombre = nombre;
        this.instructor = instructor;
        unidades = new ArrayList<>();
        unidades.add(new Unidad("Introduccion", "Conceptos basicos del curso"));
        unidades.add(new Unidad("Fundamentos", "Temas fundamentales"));
        unidades.add(new Unidad("Practica", "Aplicacion de conocimientos"));
        unidades.add(new Unidad("Proyecto final", "Desarrollo del proyecto"));
    }
    public void mostrarCurso() {
        System.out.println("INFORMACION DEL CURSO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Instructor: " + instructor);
        System.out.println("\nUNIDADES DEL CURSO");
        for (Unidad unidad : unidades) {
            System.out.println("--------------------");
            System.out.println(unidad.mostrarInformacion());
        }
    }
}