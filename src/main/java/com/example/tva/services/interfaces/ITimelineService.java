package com.example.tva.services.interfaces;

import com.example.tva.domain.models.Timeline;
import com.example.tva.domain.requests.CreateTimelineRequest;
import com.example.tva.domain.responses.CreateTimelineResponse;

public interface ITimelineService {

    CreateTimelineResponse createTimeline(CreateTimelineRequest request);

    Timeline getTimelineById(String timelineId);

}
