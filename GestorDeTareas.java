import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * GestorDeTareas
 */

 class GestorDeTareas {
    private List<Tarea> tareas;

    public GestorDeTareas() {
        tareas = new ArrayList<>();
    }

    //Registra las tareas que el usuario ponga
    public void registrarTarea(String nombre, String descripcion, int prioridad) {
        Tarea tarea = new Tarea(nombre, descripcion, prioridad);
        tareas.add(tarea);
        System.out.println("Tarea '" + nombre + "' registrada exitosamente.");
    }

    //Marca las tareas completadas
    public void marcarCompletada(String nombre) {
        for (Tarea tarea : tareas) {
            if (tarea.nombre.equals(nombre)) {
                tarea.marcarCompletada();
                System.out.println("Tarea '" + nombre + "' marcada como completada.");
                return;
            }
        }
        System.out.println("Tarea '" + nombre + "' no encontrada.");
    }

    //Elimina las tareas
    public void eliminarTarea(String nombre) {
        for (Tarea tarea : tareas) {
            if (tarea.nombre.equals(nombre)) {
                tareas.remove(tarea);
                System.out.println("Tarea '" + nombre + "' eliminada.");
                return;
            }
        }
        System.out.println("Tarea '" + nombre + "' no encontrada.");
    }

    //Muestra las tareas pendientes
    public void mostrarTareasPendientes() {
        List<Tarea> tareasPendientes = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (!tarea.completada) {
                tareasPendientes.add(tarea);
            }
        }

        Collections.sort(tareasPendientes, Comparator.comparingInt(t -> t.prioridad));

        System.out.println("Listado de tareas pendientes ordenadas por prioridad:");
        for (Tarea tarea : tareasPendientes) {
            System.out.println(tarea);
        }
    }
}
