package kotlinOPP.Hotel

import java.util.*

class Reserva(val habitacion: Habitacion, val cliente: Cliente, val fechaInicio: Date, val fechaFin: Date) {
    override fun toString(): String {
        return "Reserva(habitacion=$habitacion, cliente=$cliente, fechaInicio=$fechaInicio, fechaFin=$fechaFin)"
    }
}