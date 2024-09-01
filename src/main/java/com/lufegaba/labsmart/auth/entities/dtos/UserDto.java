package com.lufegaba.labsmart.auth.entities.dtos;

import com.lufegaba.labsmart.auth.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    Long id;
    String firstName;
    String lastName;
    String email;
    Boolean isActive;
    Role role;
    boolean isWorker;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

}
