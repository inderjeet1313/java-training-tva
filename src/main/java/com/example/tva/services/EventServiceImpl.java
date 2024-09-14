package com.example.tva.services;

import com.example.tva.dao.IEventDAO;
import com.example.tva.dao.ITimelineDAO;
import com.example.tva.domain.constants.EventTypeEnum;
import com.example.tva.domain.models.Event;
import com.example.tva.domain.requests.CreateEventRequest;
import com.example.tva.domain.responses.CreateEventResponse;
import com.example.tva.services.interfaces.IEventService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EventServiceImpl implements IEventService {

    IEventDAO eventDAO;

    @Override
    public CreateEventResponse createEvent(CreateEventRequest createEventRequest) {
        String eventId = UUID.randomUUID().toString();

        Event event = new Event();
        event.setEventId(eventId);
        event.setEventName(createEventRequest.getEventName());
        event.setEventDescription(createEventRequest.getEventDescription());
        event.setTimestamp(Timestamp.valueOf(createEventRequest.getTimestamp()));
        event.setEventType(EventTypeEnum.valueOf(createEventRequest.getEventType()));

        eventDAO.save(event);

        return new CreateEventResponse(eventId, event.getEventName());
    }
}
