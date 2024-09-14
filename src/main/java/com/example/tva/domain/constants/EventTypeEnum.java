package com.example.tva.domain.constants;

import java.util.Objects;

public enum EventTypeEnum {

    CRITICAL("Critical"),
    NEUTRAL("Neutral"),
    ANOMALOUS("Anomalous");

    final String eventTypeEnum;

    EventTypeEnum(String eventTypeEnum) {
        this.eventTypeEnum = eventTypeEnum;
    }

    public static EventTypeEnum value(String eventType) {
        if (Objects.isNull(eventType)) {
            throw new IllegalArgumentException("eventType is null");
        }

        eventType = eventType.trim();
        eventType = eventType.toUpperCase();

        for (EventTypeEnum eventTypeEnum1 : EventTypeEnum.values()) {
            if (eventTypeEnum1.eventTypeEnum.equalsIgnoreCase(eventType)) {
                return eventTypeEnum1;
            }
        }
        throw new IllegalArgumentException(eventType + " is not a valid event type");
    }

}
