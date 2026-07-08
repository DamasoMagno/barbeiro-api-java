package com.barbeiro.barbeiro.dtos;

import jakarta.validation.constraints.NotNull;

public record CreateBarbershop(
        @NotNull String name,
        @NotNull String address,
        @NotNull String phoneNumber,
        @NotNull String email
) {
}
