package com.LensAssignment.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class LoginResponse {
    @Getter
    private String token;
    private long expiresIn;
}