package Java.Hotel;

import java.util.Date;

class Reserva {
    private Habitacion habitacion;
    private Cliente cliente;
    private Date fechaInicio;
    private Date fechaFin;

    public Reserva(Habitacion habitacion, Cliente cliente, Date fechaInicio, Date fechaFin) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "habitacion=" + habitacion +
                ", cliente=" + cliente +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}