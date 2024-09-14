package com.example.tva.services.interfaces;

import com.example.tva.domain.requests.CreateEventRequest;
import com.example.tva.domain.responses.CreateEventResponse;

public interface IEventService {

    CreateEventResponse createEvent(CreateEventRequest createEventRequest);

}
