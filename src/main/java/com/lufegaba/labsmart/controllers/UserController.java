package com.lufegaba.labsmart.controllers;

import com.lufegaba.labsmart.auth.CustomUserDetailsService;
import com.lufegaba.labsmart.auth.entities.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final CustomUserDetailsService usersService;
    private final UserMapper mapper;


}
