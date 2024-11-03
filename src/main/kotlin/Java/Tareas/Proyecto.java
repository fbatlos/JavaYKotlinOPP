package Java.Tareas;

import java.util.ArrayList;
import java.util.List;

class Proyecto {
    private String nombre;
    private List<Tarea> tareas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
        System.out.println("Tarea '" + tarea.getNombre() + "' añadida al proyecto '" + nombre + "'.");
    }

    public void mostrarTareas() {
        System.out.println("Tareas del proyecto '" + nombre + "':");
        for (Tarea tarea : tareas) {
            System.out.println("- " + tarea);
        }
    }

    public void marcarTareaComoCompletada(String nombreTarea) {
        for (Tarea tarea : tareas) {
            if (tarea.getNombre().equals(nombreTarea) && !tarea.isCompletada()) {
                tarea.marcarComoCompletada();
                return;
            }
        }
        System.out.println("Tarea '" + nombreTarea + "' no encontrada o ya está completada.");
    }
}