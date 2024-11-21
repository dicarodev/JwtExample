package com.dicarodev.jwtimplementation;

import com.dicarodev.jwtimplementation.model.user.Role;
import com.dicarodev.jwtimplementation.model.user.UserApp;
import com.dicarodev.jwtimplementation.repository.UserAppRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@RequiredArgsConstructor
public class JwtImplementationApp implements CommandLineRunner {

    private final UserAppRepository userAppRepository;
    private final PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(JwtImplementationApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        UserApp userApp1 = UserApp.builder()
                .name("Angel")
                .firstSurname("Mendoza")
                .secondSurname("García")
                .email("angelmg@email.com")
                .password(passwordEncoder.encode("1234"))
                .role(Role.USER)
                .build();

        userAppRepository.save(userApp1);
    }
}
