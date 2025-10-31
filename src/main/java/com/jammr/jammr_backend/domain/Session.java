package com.jammr.jammr_backend.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "session")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User host;

    private String song;
    private long startedAt;
}
