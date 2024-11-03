package kotlinOPP.Hotel

import java.util.*

fun main() {
    val sistema = SistemaReservas()

    val habitacion1 = Habitacion(101, "Sencilla", 50.0)
    val habitacion2 = Habitacion(102, "Doble", 75.0)

    val cliente1 = Cliente("Juan Pérez", "12345678")
    val cliente2 = Cliente("Ana Gómez", "87654321")

    // Realizar reservas
    sistema.reservarHabitacion(habitacion1, cliente1, Date(), Date(System.currentTimeMillis() + 86400000)) // Reserva de 1 día
    sistema.reservarHabitacion(habitacion2, cliente2, Date(), Date(System.currentTimeMillis() + 86400000)) // Reserva de 1 día

    // Mostrar reservas activas
    sistema.mostrarReservasActivas()

    // Cancelar una reserva
    val reserva = sistema.reservas[0]
    sistema.cancelarReserva(reserva)

    // Mostrar reservas activas después de cancelar
    sistema.mostrarReservasActivas()
}