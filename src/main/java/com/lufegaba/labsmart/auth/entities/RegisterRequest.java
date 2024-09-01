package com.lufegaba.labsmart.auth.entities;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    @NotNull(message = "Email no puede ser nulo")
    @Email(message = "Email con formato inválido")
    String email;

    @NotNull(message = "Password no puede ser nulo")
    @Size(min = 5, max = 30, message = "Password debe tener entre 5 y 30 caracteres")
    String password;

    @NotNull(message = "Nombre no puede ser nulo")
    @Size(min = 2, max = 30, message = "nombre debe tener entre 2 y 30 caracteres")
    String firstName;

    @NotNull(message = "Apellido no puede ser nulo")
    @Size(min = 2, max = 30, message = "Apellido debe tener entre 2 y 30 caracteres")
    String lastName;

}
