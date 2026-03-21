package com.bhapkar.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bhapkar.springboot.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> 
{
    Optional<User> findByUsername(String username);
}
