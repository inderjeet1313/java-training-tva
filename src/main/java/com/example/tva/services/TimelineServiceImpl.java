package com.example.tva.services;

import com.example.tva.dao.ITimelineDAO;
import com.example.tva.domain.models.Timeline;
import com.example.tva.domain.requests.CreateTimelineRequest;
import com.example.tva.domain.responses.CreateTimelineResponse;
import com.example.tva.services.interfaces.ITimelineService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class TimelineServiceImpl implements ITimelineService {

    ITimelineDAO timelineDAO;

    @Override
    public CreateTimelineResponse createTimeline(CreateTimelineRequest request) {
        String timelineId = UUID.randomUUID().toString();

        Timeline timeline = new Timeline();
        timeline.setTimelineId(timelineId);
        timeline.setTimelineName(request.getTimelineName());

        timelineDAO.save(timeline);

        return new CreateTimelineResponse(timeline);
    }

    @Override
    public Timeline getTimelineById(String timelineId) {
        Timeline timeline = new Timeline();
        timelineDAO.findById(timelineId).ifPresent(timeline1 -> {
            timeline.setTimelineId(timeline1.getTimelineId());
            timeline.setTimelineName(timeline1.getTimelineName());
        });

        return timeline;
    }

}
