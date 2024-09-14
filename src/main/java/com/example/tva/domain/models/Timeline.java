package com.example.tva.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "timelines")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Timeline {

    @Id
    private String timelineId;

    private String timelineName;

}
