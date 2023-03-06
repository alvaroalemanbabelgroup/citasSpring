package com.example.citasSpring.repository.impl;

import com.example.citasSpring.domain.Cita;
import com.example.citasSpring.repository.CitaRepository;

import java.util.ArrayList;
import java.util.List;

public class CitaRepositoryMemory implements CitaRepository {

    private List<Cita> citas;

    public CitaRepositoryMemory(){
        citas = new ArrayList<>();
    }
    @Override
    public void alta(Cita cita) {
        citas.add(cita);
    }

    @Override
    public void baja(int id) {
        citas.remove(id);
    }

    @Override
    public List<Cita> listar() {
        return citas;
    }
}
