package com.example.tva;

import com.example.tva.dao.IEventDAO;
import com.example.tva.domain.models.Event;
import com.example.tva.domain.requests.CreateEventRequest;
import com.example.tva.domain.responses.CreateEventResponse;
import com.example.tva.services.EventServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class EventServiceImplTest {

    @Mock
    private IEventDAO eventDAO;

    @InjectMocks
    private EventServiceImpl eventService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateEvent() {
        CreateEventRequest request = new CreateEventRequest();
        request.setEventName("Test Event");
        request.setEventDescription("Test Description");
        request.setTimestamp("2023-10-01 10:00:00");
        request.setEventType("Neutral");

        when(eventDAO.save(any(Event.class))).thenReturn(null);

        CreateEventResponse response = eventService.createEvent(request);

        verify(eventDAO).save(any(Event.class));
        assertEquals("Test Event", response.getEventName());
    }

}
