package com.example.demospringboot;

import org.springframework.data.mongodb.repository.MongoRepository;


// Das Interface ist zuständig für Datenbankzugriffe

public interface TimeEntriesRepository extends MongoRepository<TimeEntry, String> {

}
