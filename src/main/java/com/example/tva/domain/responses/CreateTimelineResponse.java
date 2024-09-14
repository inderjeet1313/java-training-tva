package com.example.tva.domain.responses;

import com.example.tva.domain.models.Timeline;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateTimelineResponse {

    public CreateTimelineResponse(Timeline timeline) {
        this.timelineId = timeline.getTimelineId();
        this.timelineName = timeline.getTimelineName();
    }

    String timelineId;

    String timelineName;

}
