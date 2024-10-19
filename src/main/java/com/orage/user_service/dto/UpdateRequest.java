package com.orage.user_service.dto;

import com.orage.user_service.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRequest {
    public String username;
    public String password;
    public Set<Role> roles;
}
