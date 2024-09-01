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
public class LoginRequest {

    @NotNull(message = "Email no puede ser nulo")
    @Email(message = "Email debe tener formato de email válido")
    String email;

    @NotNull(message = "Password no puede ser nulo")
    @Size(min = 5, max = 30, message = "Password debe tener entre 5 y 30 caracteres")
    String password;
}
