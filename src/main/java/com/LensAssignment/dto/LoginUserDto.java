package com.LensAssignment.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginUserDto {
    private String email;
    private String password;
}
