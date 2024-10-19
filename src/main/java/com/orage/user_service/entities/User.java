package com.orage.user_service.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;
@Builder
@Document(collection = "users")
@Data
public class User {
    private String id;
    private String username;
    private String password;
    private Set<Role> roles;
}
