package com.lufegaba.labsmart.auth.entities.mappers;

import com.lufegaba.labsmart.auth.entities.LabUser;
import com.lufegaba.labsmart.auth.entities.dtos.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto UserToDto (LabUser u) {
        return UserDto.builder()
                .id(u.getId())
                .email(u.getEmail())
                .firstName(u.getFirstName())
                .lastName(u.getLastName())
                .role(u.getRole())
                .createdAt(u.getCreated())
                .updatedAt(u.getUpdated())
                .isActive(u.getIsActive())
                .build();
    }
}
