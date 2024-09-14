package com.example.tva.controller;

import com.example.tva.domain.models.Timeline;
import com.example.tva.domain.requests.CreateTimelineRequest;
import com.example.tva.domain.responses.CreateTimelineResponse;
import com.example.tva.services.interfaces.ITimelineService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TimelineController {

    ITimelineService timelineService;

    @Operation(summary = "Add New Timeline", description = "API to add a new timeline")
    @PostMapping(value = "/add-timeline")
    public ResponseEntity<CreateTimelineResponse> createTimeline(
            @Parameter(description = "Request to create a new Timeline")
            @Valid
            @RequestBody
            CreateTimelineRequest request
    ) {
        CreateTimelineResponse response = this.timelineService.createTimeline(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Operation(summary = "Get new timeline", description = "API to fetch a timelines")
    @GetMapping(value = "/get-timeline")
    public ResponseEntity<Timeline> getTimelineById(
            @Parameter(description = "Timeline Id")
            String timelineId
    ) {
        Timeline timeline = this.timelineService.getTimelineById(timelineId);
        return new ResponseEntity<>(timeline, HttpStatus.OK);
    }

}
