package com.orage.user_service.dto;

import com.orage.user_service.entities.Role;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder

public class RegisterRequest {
    private String username;
    private String password;
     private Set<Role> roles;
}
