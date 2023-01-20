package com.example.empresaevaluacinjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration {

    @Autowired
    private UserDetailsServiceAutoConfiguration userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // @Override
    // protected void configure(HttpSecurity http) throws Exception {
    //     http
    //     .authorizeHttpRequests()
    //     .requestMatchers("/api/empresa/**").hasRole("ADMIN")
    //     .anyRequest().authenticated()
    //     .and()
    //     .formLogin()
    //     .and()
    //     .httpBasic();
    // }
        
    // @Autowired
    // public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    //     auth
    //         .userDetailsService(userDetailsService)
    //         .passwordEncoder(passwordEncoder);
    // }
}