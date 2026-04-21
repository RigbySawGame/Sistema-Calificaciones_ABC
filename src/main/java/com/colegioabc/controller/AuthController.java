
package com.colegioabc.controller;

import com.colegioabc.config.JwtUtil;
import com.colegioabc.dto.JwtResponse;
import com.colegioabc.dto.LoginRequest;
import com.colegioabc.model.Usuario;
import com.colegioabc.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public JwtResponse login(@RequestBody LoginRequest request) {
        try {
            Usuario usuario = usuarioRepository.findByEmail(request.getEmail());
            if (usuario == null || !passwordEncoder.matches(request.getContrasena(), usuario.getContrasena())) {
                throw new RuntimeException("Credenciales inválidas");
            }

            authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getContrasena())
            );

            String token = jwtUtil.generateToken(request.getEmail());
            return new JwtResponse(token, usuario.getNombre());

        } catch (AuthenticationException e) {
            throw new RuntimeException("Error de autenticación: " + e.getMessage());
        }
    }
}
