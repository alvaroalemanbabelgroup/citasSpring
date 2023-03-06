package com.example.citasSpring.repository;

import com.example.citasSpring.domain.Cita;
import java.util.List;

public interface CitaRepository {
    void alta(Cita cita);
    void baja(int id);
    List<Cita> listar();
}
