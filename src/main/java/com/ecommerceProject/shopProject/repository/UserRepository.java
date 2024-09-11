package com.ecommerceProject.shopProject.repository;

import com.ecommerceProject.shopProject.entity.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<User1,Long> {

    Optional<org.springframework.security.core.userdetails.User> findByEmail(String email);
}
