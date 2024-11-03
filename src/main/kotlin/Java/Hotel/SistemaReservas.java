package Java.Hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class SistemaReservas {
    public List<Reserva> reservas;

    public SistemaReservas() {
        reservas = new ArrayList<>();
    }

    public void reservarHabitacion(Habitacion habitacion, Cliente cliente, Date fechaInicio, Date fechaFin) {
        Reserva nuevaReserva = new Reserva(habitacion, cliente, fechaInicio, fechaFin);
        reservas.add(nuevaReserva);
        System.out.println("Reserva realizada: " + nuevaReserva);
    }

    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
        System.out.println("Reserva cancelada: " + reserva);
    }

    public void mostrarReservasActivas() {
        System.out.println("Reservas activas:");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
}