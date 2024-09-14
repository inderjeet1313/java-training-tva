package com.example.tva.domain.requests;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateEventRequest {

    @NonNull
    String eventName;

    String eventDescription;

    String timelineId;

    String timestamp;

    String eventType;
}
