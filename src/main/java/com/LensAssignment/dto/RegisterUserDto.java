package com.LensAssignment.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegisterUserDto {
    private String email;
    private String password;
    private String fullName;
}
