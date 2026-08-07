package com.college.gatepass;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponse {
    private String status;
    private Long userId;
    private String role;
    private String token;
}