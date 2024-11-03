package Java.Tareas;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nombre;
    private List<Proyecto> proyectos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.proyectos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void crearProyecto(String nombreProyecto) {
        Proyecto nuevoProyecto = new Proyecto(nombreProyecto);
        proyectos.add(nuevoProyecto);
        System.out.println("Proyecto '" + nombreProyecto + "' creado por " + nombre + ".");
    }

    public Proyecto obtenerProyecto(String nombreProyecto) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getNombre().equals(nombreProyecto)) {
                return proyecto;
            }
        }
        System.out.println("Proyecto '" + nombreProyecto + "' no encontrado.");
        return null;
    }
}
