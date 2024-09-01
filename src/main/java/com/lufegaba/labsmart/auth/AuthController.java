package com.lufegaba.labsmart.auth;

import com.lufegaba.labsmart.auth.entities.AuthResponse;
import com.lufegaba.labsmart.auth.entities.LabUser;
import com.lufegaba.labsmart.auth.entities.LoginRequest;
import com.lufegaba.labsmart.auth.entities.RegisterRequest;
import com.lufegaba.labsmart.auth.entities.dtos.UserDto;
import com.lufegaba.labsmart.auth.entities.mappers.UserMapper;
import com.lufegaba.labsmart.auth.jwt.JwtAuthenticationFilter;
import com.lufegaba.labsmart.auth.jwt.JwtService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(value = "auth/", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@CrossOrigin (origins = "http://localhost:4200")
public class AuthController {

    private final AuthService authService;
    private final CustomUserDetailsService userDetailsService;
    private final JwtService jwtService;
    private final UserMapper mapper;
    private final JwtAuthenticationFilter jwtFilter;


    @PostMapping(value = "/login")
    public ResponseEntity<AuthResponse> login (@RequestBody @Valid LoginRequest request){
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(value = "/register")
    public ResponseEntity<AuthResponse> register (@RequestBody @Valid RegisterRequest request){
        return ResponseEntity.ok(authService.register(request));
    }

    @GetMapping(value = "/check-user")
    public ResponseEntity<UserDto> getUserFromToken (@RequestParam String token){
        var email = jwtService.extractUsername(token);
        return ResponseEntity.ok(mapper.UserToDto((LabUser) userDetailsService.loadUserByUsername(email)));
    }
}
