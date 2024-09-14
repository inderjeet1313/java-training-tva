package com.example.tva.dao;

import com.example.tva.domain.models.Timeline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITimelineDAO extends JpaRepository<Timeline, String> {
}
