package com.example.login;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class SecurityRestApplication {
    @Bean
    CommandLineRunner init(RoleRepository roleRepository) {

        return args -> {

            Role adminRole = roleRepository.findByRole("ADMIN");
            if (adminRole == null) {
                Role newAdminRole = new Role();
                newAdminRole.setRole("ADMIN");
                roleRepository.save(newAdminRole);
            }
        };
    }
}
