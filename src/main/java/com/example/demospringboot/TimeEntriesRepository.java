package com.example.demospringboot;

import org.springframework.data.repository.CrudRepository;


// Das Interface ist zuständig für Datenbankzugriffe

public interface TimeEntriesRepository extends CrudRepository<TimeEntry, Long> {

}
