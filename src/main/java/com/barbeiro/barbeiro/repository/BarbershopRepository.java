package com.barbeiro.barbeiro.repository;

import com.barbeiro.barbeiro.entities.BarberShop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BarbershopRepository extends JpaRepository<BarberShop, UUID> {}
