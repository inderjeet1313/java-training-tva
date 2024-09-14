package com.example.tva.domain.requests;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateTimelineRequest {

    @NonNull
    String timelineName;

}
