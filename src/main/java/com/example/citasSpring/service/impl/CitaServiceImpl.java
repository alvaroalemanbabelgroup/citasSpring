package com.example.citasSpring.service.impl;

import com.example.citasSpring.domain.Cita;
import com.example.citasSpring.repository.CitaRepository;
import com.example.citasSpring.service.CitaService;

import java.util.List;

public class CitaServiceImpl implements CitaService {

    CitaRepository citaRepository;

    public CitaServiceImpl(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    public void alta(Cita cita){
        citaRepository.alta(cita);
    }
    public void baja(int id){
        citaRepository.baja(id);
    }
    public List<Cita> listar(){
        return citaRepository.listar();
    }
}
