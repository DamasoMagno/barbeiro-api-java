package com.barbeiro.barbeiro.repository;

import com.barbeiro.barbeiro.entities.Barber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BarberRepository extends JpaRepository<Barber, UUID> {}
