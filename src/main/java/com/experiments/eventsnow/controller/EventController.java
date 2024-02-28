package com.experiments.eventsnow.controller;

import com.experiments.eventsnow.model.Event;
import com.experiments.eventsnow.service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EventController {

    @Autowired
    private EventsService eventsService;


    @GetMapping("/allevents")
    public List<Event> getAllEvents(){
        return this.eventsService.getAllMyEvents();
    }


    @PostMapping("/add")
    public String addEvent(@RequestBody Event mynewEvent){
        return  this.eventsService.addEvent(mynewEvent);
    }

    @PutMapping("/update/{eventId}")
    public void updateEvent(@PathVariable Integer eventId,@RequestBody Event updatedEvent){
        this.eventsService.updateEvent(eventId,updatedEvent);
    }

    @DeleteMapping("/delete/{eventId}")
    public String deleteEvent(@PathVariable Integer eventId){
       return  this.eventsService.deleteEvent(eventId);
    }
}
