package com.experiments.eventsnow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Event {



    @Id
    private Integer eventId;

    private String eventname;

    private String eventDescription;

    private String EventDate;

    private String location;

}
