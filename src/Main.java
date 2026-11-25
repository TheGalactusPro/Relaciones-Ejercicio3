public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Programacion Java", "Carlos Ramirez");
        curso1.mostrarCurso();
        System.out.println("\n");
        Curso curso2 = new Curso("Bases de Datos", "Maria Lopez");
        curso2.mostrarCurso();
    }
}