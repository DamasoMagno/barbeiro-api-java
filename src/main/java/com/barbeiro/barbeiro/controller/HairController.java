package com.barbeiro.barbeiro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hair")
public class HairController {

    @GetMapping
    public String getHairs() {
        return "List of barbers";
    }

}
