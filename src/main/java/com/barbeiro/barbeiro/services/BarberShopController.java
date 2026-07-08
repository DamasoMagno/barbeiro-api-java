package com.barbeiro.barbeiro.services;

import com.barbeiro.barbeiro.dtos.CreateBarbershop;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/barbershop")
public class BarberShopController {

    @GetMapping
    public String getBarbershops() {
        return "List of barbers";
    }

    @GetMapping("/{id}")
    public String getBarbershopById(@RequestParam Long id) {
        return "Barbershop with ID: " + id;
    }

    @PostMapping
    public String createBarbershop(
            @Valid @RequestBody CreateBarbershop createBarbershop
    ) {
        return "Barbershop created";
    }

    @PutMapping
    public String updateBarbershop() {
        return "Barbershop updated";
    }

    @DeleteMapping
    public String deleteBarbershop() {
        return "Barbershop deleted";
    }

}
