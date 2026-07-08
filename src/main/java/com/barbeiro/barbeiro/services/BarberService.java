package com.barbeiro.barbeiro.services;

import com.barbeiro.barbeiro.entities.Barber;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

public interface BarberService {
    Barber findById(UUID id);
    Page<Barber> findAll(Pageable pageable);
    void deleteById(UUID id);
    void updateBarber(UUID id, Barber barber);
}
