package net.elbahja.backendspring.repository;

import org.springframework.security.core.userdetails.UserDetails;

public interface JWTInterface {
    String extractUsername(String token);
    String generateToken(UserDetails userDetails);
}
