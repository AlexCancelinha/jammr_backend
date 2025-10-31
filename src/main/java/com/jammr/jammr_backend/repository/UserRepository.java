package com.jammr.jammr_backend.repository;

import com.jammr.jammr_backend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
