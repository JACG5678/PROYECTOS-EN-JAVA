import java.util.Random;


public class ProgramaHilos {
    public static void main(String[] args) {
        Tarea[] tareas = new Tarea[4];

        for (int i = 0; i < tareas.length; i++) {
            tareas[i] = new Tarea();
            tareas[i].start();
        }

        // Esperar a que todas las tareas finalicen
        for (Tarea tarea : tareas) {
            try {
                tarea.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Obtener los porcentajes de completado de cada tarea
        for (int i = 0; i < tareas.length; i++) {
            System.out.println("Tarea " + (i+1) + ": " + tareas[i].getPorcentaje() + "% completado");
        }
    }
}
