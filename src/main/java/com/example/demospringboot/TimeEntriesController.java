package com.example.demospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Controller
public class TimeEntriesController {

    @Autowired
    TimeEntriesRepository repository;

    @GetMapping("/add_timeentries")
    ModelAndView addTimeentries() {

        TimeEntry timeEntry = new TimeEntry(LocalDateTime.now());
        repository.save(timeEntry);
        return timeentries();
    }

    @GetMapping("/timeentries")
    ModelAndView timeentries() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("timeentries"); // timeentries ist der Name des Templates, das zurückgegeben wird: resources/templates/timeentries.html
        modelAndView.addObject("title", "Time Entries");
        modelAndView.addObject("timeEntries", repository.findAll());
        return modelAndView;
    }
}
