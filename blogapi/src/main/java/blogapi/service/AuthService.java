package blogapi.service;

import blogapi.dto.AuthResponse;
import blogapi.dto.LoginRequest;
import blogapi.dto.RegisterRequest;
import blogapi.entity.User;
import blogapi.repository.UserRepository;
import blogapi.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;
    public AuthResponse register(RegisterRequest request){
        User user=User.builder().name(request.getName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .roles(Set.of("ROLE_USER")).build();
        userRepository.save(user);
        String token = jwtUtil.generateToken(user.getEmail());
        return new AuthResponse(token);

    }

    public AuthResponse login(LoginRequest request){
        User user=userRepository.findByEmail(request.getEmail()).orElseThrow(()->new RuntimeException("User not found"));
        if(!passwordEncoder.matches(request.getPassword(),user.getPassword())){
            throw new RuntimeException("Invalid password");

        }
        String token = jwtUtil.generateToken(user.getEmail());
        return new AuthResponse(token);

    }

}