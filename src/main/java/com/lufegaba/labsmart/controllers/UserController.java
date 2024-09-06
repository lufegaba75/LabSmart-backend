package com.lufegaba.labsmart.controllers;

import com.lufegaba.labsmart.auth.CustomUserDetailsService;
import com.lufegaba.labsmart.auth.entities.LabUser;
import com.lufegaba.labsmart.auth.entities.dtos.UserDto;
import com.lufegaba.labsmart.auth.entities.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final CustomUserDetailsService usersService;
    private final UserMapper mapper;

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers () {
        var users = usersService.getAllUsers();
        var usersDto = new ArrayList<UserDto>();
        users.forEach( user -> {
           var userDto = mapper.UserToDto(user);
           usersDto.add(userDto);
            System.out.println(userDto.getEmail());
        });

        return ResponseEntity.ok(usersDto);
    }


}
