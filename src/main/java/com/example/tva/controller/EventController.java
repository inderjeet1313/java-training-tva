package com.example.tva.controller;

import com.example.tva.domain.requests.CreateEventRequest;
import com.example.tva.domain.responses.CreateEventResponse;
import com.example.tva.services.interfaces.IEventService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EventController {

    IEventService eventService;

    @Operation(summary = "Add new event", description = "API to add a new event")
    @PostMapping(value = "/add-event")
    public ResponseEntity<CreateEventResponse> createEvent(
            @Parameter(description = "Request to create an Event")
            @Valid
            @RequestBody
            CreateEventRequest request) {
        CreateEventResponse response = eventService.createEvent(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
