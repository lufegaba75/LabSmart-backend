package com.lufegaba.labsmart.auth.entities;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AuthResponse {

    String token;

}
