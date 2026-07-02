package com.barbeiro.barbeiro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/barbers")
public class BarberController {

    @GetMapping
    public String getBarbers() {
        return "List of barbers";
    }

}
