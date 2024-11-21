package com.dicarodev.jwtimplementation.repository;

import com.dicarodev.jwtimplementation.model.user.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserAppRepository extends JpaRepository<UserApp, Long> {

    Optional<UserApp> findByEmail(String email);
}
