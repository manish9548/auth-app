package com.auth.auth_app.Dto;


import com.auth.auth_app.entities.Provider;
import com.auth.auth_app.entities.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data

public class UserDto {



        private UUID id;

        private String email;

        private String name ;
        private String password;
        private String image;
        private boolean enable = true;
        private Instant createdAt = Instant.now();
        private Instant updateAt = Instant.now();
        private Provider provider = Provider.LOCAL;
        private  Set<RoleDto> roles = new HashSet<>();




    }



