package com.jammr.jammr_backend.controller;

import com.jammr.jammr_backend.domain.Session;
import com.jammr.jammr_backend.repository.SessionRepository;
import com.jammr.jammr_backend.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/api/sessions")
public class SessionController {
    private final SessionRepository sessionRepo;
    private final UserRepository userRepo;

    public SessionController(SessionRepository sessionRepo, UserRepository userRepo) {
        this.sessionRepo = sessionRepo;
        this.userRepo = userRepo;
    }

    @PostMapping("/start")
    public Session start(@RequestParam Long userId, @RequestParam String song) {
        var host = userRepo.findById(userId).orElseThrow();
        var session = Session.builder()
                .host(host)
                .song(song)
                .startedAt(Instant.now().toEpochMilli())
                .build();
        return sessionRepo.save(session);
    }

    @GetMapping
    public List<Session> all() {
        return sessionRepo.findAll();
    }
}
