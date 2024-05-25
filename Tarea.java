//Creamos la clase tarea
class Tarea{
String nombre;
String descripcion;
int prioridad;
boolean completada;

public Tarea(String nombre, String descripcion, int prioridad){
this.nombre = nombre;
this.descripcion = descripcion;
this.prioridad = prioridad;
this.completada = false;
}

public void marcarCompletada(){
    this.completada = true;
}

@Override
public String toString() {
    return "Nombre: " + nombre + ", Descripción: " + descripcion + ", Prioridad: " + prioridad;
}

}
