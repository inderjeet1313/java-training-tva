CREATE TABLE timelines (
    timeline_id VARCHAR(255) PRIMARY KEY,
    timeline_name VARCHAR(255) NOT NULL
);

CREATE TABLE events (
    event_id VARCHAR(255) PRIMARY KEY,
    timeline_id VARCHAR(255),
    event_name VARCHAR(255) NOT NULL,
    event_description TEXT,
    timestamp TIMESTAMP,
    event_type VARCHAR(255),
    FOREIGN KEY (timeline_id) REFERENCES timelines(timeline_id) ON DELETE CASCADE
);