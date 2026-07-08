package com.barbeiro.barbeiro.services.Impl;

import com.barbeiro.barbeiro.entities.Barber;
import com.barbeiro.barbeiro.repository.BarberRepository;
import com.barbeiro.barbeiro.services.BarberService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public class BarberServiceImpl implements BarberService {
    private final BarberRepository barberRepository;

    public BarberServiceImpl(BarberRepository barberRepository) {
        this.barberRepository = barberRepository;
    }

    @Override
    public Barber findById(UUID id) {
        return barberRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Barber not found with id: " + id)
        );
    }

    @Override
    public Page<Barber> findAll(Pageable pageable) {
        return barberRepository.findAll(pageable);
    }

    @Override
    public void deleteById(UUID id) {
        barberRepository.deleteById(id);
    }

    @Override
    public void updateBarber(UUID id, Barber barber) {
        Barber existingBarber = findById(id);
        existingBarber.setName(barber.getName());
        existingBarber.setPhone(barber.getPhone());
        barberRepository.save(existingBarber);
    }
}
