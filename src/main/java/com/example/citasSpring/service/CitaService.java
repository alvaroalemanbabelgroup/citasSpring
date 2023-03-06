package com.example.citasSpring.service;

import com.example.citasSpring.domain.Cita;

import java.util.List;

public interface CitaService {
    public void alta(Cita cita);
    public void baja(int id);
    public List<Cita> listar();
}
