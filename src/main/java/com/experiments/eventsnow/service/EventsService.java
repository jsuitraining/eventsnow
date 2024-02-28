package com.experiments.eventsnow.service;


import com.experiments.eventsnow.model.Event;
import com.experiments.eventsnow.repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EventsService {



         @Autowired
        private EventsRepository eventsRepository;
    // get all events

    public List<Event> getAllMyEvents() {
        return this.eventsRepository.findAll();
    }


    // add event

    public String addEvent(Event newEvent) {

         this.eventsRepository.save(newEvent);


        return "event add successfully";

    }


    // update existing event


    public void updateEvent(Integer eventId, Event updateEvent) {

        Event oldEvent = this.eventsRepository.findById(eventId).get();
        this.eventsRepository.save(updateEvent);
    }


    // delete event

    public String deleteEvent(Integer eventId) {
        this.eventsRepository.deleteById(eventId);
        return  "deleted successfully";
    }

}