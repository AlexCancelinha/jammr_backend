package com.jammr.jammr_backend.repository;


import com.jammr.jammr_backend.domain.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
