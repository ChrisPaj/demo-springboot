package com.example.demospringboot;

import java.time.*;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data  // lombok
@Entity  // Klasse kann in DB gespeichert werden - JPA (Java Persistence API)
@NoArgsConstructor
@RequiredArgsConstructor
public class TimeEntry {

    @Id // id für DB - JPA (Java Persistence API)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NonNull
    private LocalDateTime start;
    private LocalDateTime stop;
    private String description;
}
