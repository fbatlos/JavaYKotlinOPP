package Java.Tareas;

class Tarea {
    private String nombre;
    private boolean completada;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.completada = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarComoCompletada() {
        this.completada = true;
        System.out.println("La tarea '" + nombre + "' ha sido marcada como completada.");
    }

    @Override
    public String toString() {
        return nombre + (completada ? " (completada)" : " (pendiente)");
    }
}