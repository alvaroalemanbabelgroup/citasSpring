package com.example.citasSpring.domain;

import java.util.Date;

public class Cita {
    private String nombre;
    private String apellido;
    private Date date;

    public Cita(){

    }

    public Cita(String nombre, String apellido, Date date) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.date = date;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
