package Java.Hotel;

import java.util.Date;

public class MainHotel {
    public static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();

        Habitacion habitacion1 = new Habitacion(101, "Sencilla", 50.0);
        Habitacion habitacion2 = new Habitacion(102, "Doble", 75.0);

        Cliente cliente1 = new Cliente("Juan Pérez", "12345678");
        Cliente cliente2 = new Cliente("Ana Gómez", "87654321");

        sistema.reservarHabitacion(habitacion1, cliente1, new Date(), new Date(System.currentTimeMillis() + 86400000)); // Reserva de 1 día
        sistema.reservarHabitacion(habitacion2, cliente2, new Date(), new Date(System.currentTimeMillis() + 86400000)); // Reserva de 1 día

        sistema.mostrarReservasActivas();

        // Cancelar una reserva
        Reserva reserva = sistema.reservas.get(0);
        sistema.cancelarReserva(reserva);

        sistema.mostrarReservasActivas();
    }
}
