package kotlinOPP.Hotel

import java.util.*

class SistemaReservas {
    val reservas: MutableList<Reserva> = mutableListOf()

    fun reservarHabitacion(habitacion: Habitacion, cliente: Cliente, fechaInicio: Date, fechaFin: Date) {
        val reserva = Reserva(habitacion, cliente, fechaInicio, fechaFin)
        reservas.add(reserva)
        println("Reserva realizada: $reserva")
    }

    fun cancelarReserva(reserva: Reserva) {
        if (reservas.remove(reserva)) {
            println("Reserva cancelada: $reserva")
        } else {
            println("No se encontró la reserva para cancelar.")
        }
    }

    fun mostrarReservasActivas() {
        if (reservas.isEmpty()) {
            println("No hay reservas activas.")
        } else {
            println("Reservas activas:")
            reservas.forEach { println(it) }
        }
    }
}