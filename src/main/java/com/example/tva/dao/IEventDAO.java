package com.example.tva.dao;

import com.example.tva.domain.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEventDAO extends JpaRepository<Event, String> {
}
