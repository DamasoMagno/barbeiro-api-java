package com.barbeiro.barbeiro.repository;

import com.barbeiro.barbeiro.entities.Barber;
import com.barbeiro.barbeiro.entities.Hair;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HairRepository extends JpaRepository<Hair, UUID> {}
