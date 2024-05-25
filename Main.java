public class Main {
    public static void main(String[] args) {
        GestorDeTareas gestor = new GestorDeTareas();
        
        //Registramos nuevas tareas 
        gestor.registrarTarea("Estudiar para el examen de matemáticas", "Estudiar los capítulos 1 a 5", 1);
        gestor.registrarTarea("Terminar el challenge del Booster", "Completar el código y enviar", 2);
        gestor.registrarTarea("Sacar cita para el doctor", "Llamar al consultorio para agendar", 3);
        gestor.registrarTarea("Agendar entrevista con Metaphorce", "Enviar correo para agendar", 1);


        //Marcamos tareas como completadas
        gestor.marcarCompletada("Terminar el challenge del Booster");

        // Eliminar una tarea
        gestor.eliminarTarea("Sacar cita para el doctor");

        
        // Mostrar el listado de tareas pendientes ordenadas por prioridad
        gestor.mostrarTareasPendientes();

    }
}
