package com.example.tva.domain.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Table(name = "timelines")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Timeline {

    @Id
    private String timelineId;

    private String timelineName;

    @OneToMany(mappedBy = "timelineId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Event> events = new ArrayList<>();

    // Method to add an event
    public void addEvent(Event event) {
        this.events.add(event);
    }

    // Method to remove an event
    public void removeEvent(Event event) {
        this.events.remove(event);
    }

}
