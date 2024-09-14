package com.example.tva.domain.models;

import com.example.tva.domain.constants.EventTypeEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Table(name = "events")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Id
    String eventId;

    String timelineId;

    String eventName;

    String eventDescription;

    Timestamp timestamp;

    EventTypeEnum eventType;
}
