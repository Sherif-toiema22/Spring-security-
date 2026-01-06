package com.sherif.SpringSecurityProjectTraining.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        UserDetails sherif = User.builder()
                .username("Sherif")
                .password("{noop}sherif1234")
                .roles("Employee")
                .build();

        return new InMemoryUserDetailsManager(sherif);
    }



}
