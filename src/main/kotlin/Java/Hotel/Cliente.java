﻿package Java.Hotel;


class Cliente {
    private String nombre;
    private String documento;

    public Cliente(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    //Recordar qu esto es importante
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }
}