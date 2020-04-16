package com.example.demospringboot;

import java.time.*;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document // mongo
@Data  // lombok
@NoArgsConstructor // lombok
@RequiredArgsConstructor // lombok
public class TimeEntry {

    @Id // kommt von spring.framework (nicht von JPA, wie bei der H2-DB
    private String id;
    @NonNull
    private LocalDateTime start;
    private LocalDateTime stop;
    private String description;
}
