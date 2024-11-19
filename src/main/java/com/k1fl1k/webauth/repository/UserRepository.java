package com.k1fl1k.webauth.repository;

import com.k1fl1k.webauth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}