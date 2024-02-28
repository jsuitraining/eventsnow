package com.experiments.eventsnow.repository;

import com.experiments.eventsnow.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepository extends JpaRepository<Event,Integer> {
}
